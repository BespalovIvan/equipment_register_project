package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerModelRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ComputerModelServiceImpl implements ComputerModelService {
    private final ComputerModelRepository computerModelRepository;
    private final ComputerRepository computerRepository;

    public ComputerModelServiceImpl(ComputerModelRepository computerModelRepository,
                                    ComputerRepository computerRepository) {
        this.computerModelRepository = computerModelRepository;
        this.computerRepository = computerRepository;
    }

    @Override
    public ComputerModelDto addModelFromComputer(UUID id, ComputerModelDto computerModelDto) {
        ComputerModel computerModel = new ComputerModel(computerModelDto);
        computerModelRepository.save(computerModel);
        Computer computer = computerRepository
                .findById(id)
                .orElseThrow(()->new NullPointerException("computer with id " + id + " not found"));
        computer.getComputerModels().add(computerModel);
        computerRepository.save(computer);
        return new ComputerModelDto(computerModel);
    }

}

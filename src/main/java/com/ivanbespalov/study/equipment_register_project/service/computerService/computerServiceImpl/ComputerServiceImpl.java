package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;

    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = new Computer(computerDto);
        computerRepository.save(computer);
        return new ComputerDto(computer);
    }

    @Override
    public ComputerDto getComputerById(UUID id) {
        Computer computer = computerRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("computer with id " + " not found"));
        ComputerDto computerDto = new ComputerDto(computer);
        Set<ComputerModel> modelAvailability = computer.getModelAvailability();
        Set<ComputerModelDto> computerModelDto = new HashSet<>();
        for (ComputerModel model : modelAvailability) {
            computerModelDto.add(new ComputerModelDto(model));
        }
        computerDto.setModelsComputerDto(computerModelDto);
        return computerDto;
    }

    @Override
    public ComputerDto updateComputer(ComputerDto computerDto) {
        Computer computer = new Computer(computerDto);
        computer.setId(computerDto.getId());
        computerRepository.save(computer);
        return new ComputerDto(computer);
    }

    @Override
    public String deleteComputer(UUID id) {
        Computer computer = computerRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("computer not found"));
        computerRepository.delete(computer);
        return "Computer with id " + id + " was deleted";
    }
}

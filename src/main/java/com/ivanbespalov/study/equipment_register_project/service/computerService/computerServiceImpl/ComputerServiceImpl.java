package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;

    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public ComputerDto addNewComputer(ComputerDto computerDto) {
        Computer computer = new Computer(computerDto);
        computerRepository.save(computer);
        return new ComputerDto(computer);
    }

    @Override
    public ComputerDto getComputerByName(String name) {
        Computer computer = computerRepository
                .findByNameIgnoreCase(name)
                .orElseThrow(() -> new NullPointerException("computer with name " + name + " not found"));
        Set<ComputerModelDto> computerModelDto = new HashSet<>();
        computer.getModelAvailability()
                .forEach(model -> computerModelDto.add(new ComputerModelDto(model)));
        ComputerDto computerDto = new ComputerDto(computer);
        computerDto.setComputerModels(computerModelDto);
        return computerDto;
    }

    @Override
    public List<ComputerDto> getAllComputers() {
        List<ComputerDto> computerDtoList = new ArrayList<>();
        List<Computer> computers = computerRepository.findAll();
        computers.forEach(computer -> computerDtoList.add(new ComputerDto(computer)));
        return computerDtoList;
    }
}

package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import com.ivanbespalov.study.equipment_register_project.utils.QPredicates;
import com.querydsl.core.types.Predicate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ivanbespalov.study.equipment_register_project.model.computer.QComputerModel.computerModel;

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
    public ComputerModelDto addModelFromComputer(ComputerModelDto computerModelDto) {
        ComputerModel computerModel = new ComputerModel(computerModelDto);
        computerModelRepository.save(computerModel);
        Computer computer = computerRepository
                .findById(computerModelDto.getAppliancesId())
                .orElseThrow(() -> new NullPointerException("computer with id "
                        + computerModelDto.getAppliancesId() + " not found"));
        computer.getComputerModels().add(computerModel);
        computerRepository.save(computer);
        ComputerModelDto dtoResult = new ComputerModelDto(computerModel);
        dtoResult.setAppliancesId(computerModelDto.getAppliancesId());
        return dtoResult;
    }

    @Override
    public List<ComputerModelDto> findByFilter(ComputerFilterDto filterDto) {
        List<ComputerModel> computerModels = new ArrayList<>();
        List<ComputerModelDto> result = new ArrayList<>();
        Predicate predicate = QPredicates.builder()
                .add(filterDto.getCategory(), computerModel.category::containsIgnoreCase)
                .add(filterDto.getCpu(), computerModel.cpu::containsIgnoreCase)
                .add(filterDto.getColor(), computerModel.color::containsIgnoreCase)
                .buildAnd();
        Iterable<ComputerModel> filterModels = computerModelRepository.findAll(predicate);
        filterModels.forEach(computerModels::add);
        computerModels.forEach(model -> result.add(new ComputerModelDto(model)));
        return result;
    }
}

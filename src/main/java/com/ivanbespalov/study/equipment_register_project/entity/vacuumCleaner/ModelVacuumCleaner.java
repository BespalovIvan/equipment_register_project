package com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto.ModelVacuumCleanerDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "model_vacuum_cleaner")
public class ModelVacuumCleaner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID modelVacuumCleanerId;
    private String modelVacuumCleanerName;
    private int modelVacuumCleanerSerialNumber;
    private String modelVacuumCleanerColor;
    private String modelVacuumCleanerSize;
    private int modelVacuumCleanerPrice;
    private int modelVacuumCleanerDustContainerVolume;
    private int modelVacuumCleanerCountModes;
    private boolean isAvailabilityModelVacuumCleaner;

    public ModelVacuumCleaner() {
    }
    public ModelVacuumCleaner(ModelVacuumCleanerDto modelVacuumCleanerDto) {
        this.modelVacuumCleanerId = modelVacuumCleanerDto.getModelVacuumCleanerDtoId();
        this.modelVacuumCleanerName = modelVacuumCleanerDto.getModelVacuumCleanerDtoName();
        this.modelVacuumCleanerSerialNumber = modelVacuumCleanerDto.getModelVacuumCleanerDtoSerialNumber();
        this.modelVacuumCleanerColor = modelVacuumCleanerDto.getModelVacuumCleanerDtoColor();
        this.modelVacuumCleanerSize = modelVacuumCleanerDto.getModelVacuumCleanerDtoSize();
        this.modelVacuumCleanerPrice = modelVacuumCleanerDto.getModelVacuumCleanerDtoPrice();
        this.modelVacuumCleanerDustContainerVolume = modelVacuumCleanerDto.getModelVacuumCleanerDtoDustContainerVolume();
        this.modelVacuumCleanerCountModes = modelVacuumCleanerDto.getModelVacuumCleanerDtoCountModes();
        this.isAvailabilityModelVacuumCleaner = modelVacuumCleanerDto.isAvailabilityModelVacuumCleanerDto();
    }
}

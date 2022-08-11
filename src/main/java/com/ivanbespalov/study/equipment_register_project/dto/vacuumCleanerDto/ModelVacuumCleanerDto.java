package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner.ModelVacuumCleaner;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ModelVacuumCleanerDto {
    @JsonProperty(value = "modelVacuumCleanerId")
    private UUID modelVacuumCleanerDtoId;
    @JsonProperty(value = "modelVacuumCleanerName")
    private String modelVacuumCleanerDtoName;
    @JsonProperty(value = "modelVacuumCleanerSerialNumber")
    private int modelVacuumCleanerDtoSerialNumber;
    @JsonProperty(value = "modelVacuumCleanerColor")
    private String modelVacuumCleanerDtoColor;
    @JsonProperty(value = "modelVacuumCleanerSize")
    private String modelVacuumCleanerDtoSize;
    @JsonProperty(value = "modelVacuumCleanerPrice")
    private int modelVacuumCleanerDtoPrice;
    @JsonProperty(value = "modelVacuumCleanerDustContainerVolume")
    private int modelVacuumCleanerDtoDustContainerVolume;
    @JsonProperty(value = "modelVacuumCleanerCountModes")
    private int modelVacuumCleanerDtoCountModes;
    @JsonProperty(value = "isAvailabilityModelVacuumCleaner")
    private boolean isAvailabilityModelVacuumCleanerDto;

    public ModelVacuumCleanerDto(ModelVacuumCleaner modelVacuumCleaner) {
        this.modelVacuumCleanerDtoId = modelVacuumCleaner.getModelVacuumCleanerId();
        this.modelVacuumCleanerDtoName = modelVacuumCleaner.getModelVacuumCleanerName();
        this.modelVacuumCleanerDtoSerialNumber = modelVacuumCleaner.getModelVacuumCleanerSerialNumber();
        this.modelVacuumCleanerDtoColor = modelVacuumCleaner.getModelVacuumCleanerColor();
        this.modelVacuumCleanerDtoSize = modelVacuumCleaner.getModelVacuumCleanerSize();
        this.modelVacuumCleanerDtoPrice = modelVacuumCleaner.getModelVacuumCleanerPrice();
        this.modelVacuumCleanerDtoDustContainerVolume = modelVacuumCleaner.getModelVacuumCleanerDustContainerVolume();
        this.modelVacuumCleanerDtoCountModes = modelVacuumCleaner.getModelVacuumCleanerCountModes();
        this.isAvailabilityModelVacuumCleanerDto = modelVacuumCleaner.isAvailabilityModelVacuumCleaner();
    }
}

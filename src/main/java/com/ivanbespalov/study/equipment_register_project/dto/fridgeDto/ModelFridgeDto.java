package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.fridge.ModelFridge;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ModelFridgeDto {
    @JsonProperty(value = "modelFridgeId")
    private UUID modelFridgeDtoId;
    @JsonProperty(value = "modelFridgeName")
    private String modelFridgeDtoName;
    @JsonProperty(value = "modelFridgeSerialNumber")
    private int modelFridgeDtoSerialNumber;
    @JsonProperty(value = "modelFridgeColor")
    private String modelFridgeDtoColor;
    @JsonProperty(value = "modelFridgeSize")
    private String modelFridgeDtoSize;
    @JsonProperty(value = "modelFridgePrice")
    private int modelFridgeDtoPrice;
    @JsonProperty(value = "modelFridgeCountDoor")
    private int modelFridgeDtoCountDoor;
    @JsonProperty(value = "modelFridgeCompressorType")
    private String modelFridgeDtoCompressorType;
    @JsonProperty(value = "isAvailabilityModelFridge")
    private boolean isAvailabilityModelFridgeDto;

    public ModelFridgeDto(ModelFridge modelFridge) {
        this.modelFridgeDtoId = modelFridge.getModelFridgeId();
        this.modelFridgeDtoName = modelFridge.getModelFridgeName();
        this.modelFridgeDtoSerialNumber = modelFridge.getModelFridgeSerialNumber();
        this.modelFridgeDtoColor = modelFridge.getModelFridgeColor();
        this.modelFridgeDtoSize = modelFridge.getModelFridgeSize();
        this.modelFridgeDtoPrice = modelFridge.getModelFridgePrice();
        this.modelFridgeDtoCountDoor = modelFridge.getModelFridgeCountDoor();
        this.modelFridgeDtoCompressorType = modelFridge.getModelFridgeCompressorType();
        this.isAvailabilityModelFridgeDto = modelFridge.isAvailabilityModelFridge();
    }
}

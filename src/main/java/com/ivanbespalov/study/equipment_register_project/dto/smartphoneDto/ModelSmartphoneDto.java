package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.ModelSmartphone;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ModelSmartphoneDto {

    @JsonProperty(value = "modelSmartphoneId")
    private UUID modelSmartphoneDtoId;
    @JsonProperty(value = "modelSmartphoneName")
    private String modelSmartphoneDtoName;
    @JsonProperty(value = "modelSmartphoneSerialNumber")
    private int modelSmartphoneDtoSerialNumber;
    @JsonProperty(value = "modelSmartphoneColor")
    private String modelSmartphoneDtoColor;
    @JsonProperty(value = "modelSmartphoneSize")
    private String modelSmartphoneDtoSize;
    @JsonProperty(value = "modelSmartphonePrice")
    private int modelSmartphoneDtoPrice;
    @JsonProperty(value = "modelSmartphoneMemory")
    private String modelSmartphoneDtoMemory;
    @JsonProperty(value = "modelSmartphoneNumberOfCameras")
    private int modelSmartphoneDtoNumberOfCameras;
    @JsonProperty(value = "modelSmartphoneAvailability")
    private boolean modelSmartphoneDtoAvailability;

    public ModelSmartphoneDto(ModelSmartphone modelSmartphone) {
        this.modelSmartphoneDtoId = modelSmartphone.getModelSmartphoneId();
        this.modelSmartphoneDtoName = modelSmartphone.getModelSmartphoneName();
        this.modelSmartphoneDtoSerialNumber = modelSmartphone.getModelSmartphoneSerialNumber();
        this.modelSmartphoneDtoColor = modelSmartphone.getModelSmartphoneColor();
        this.modelSmartphoneDtoSize = modelSmartphone.getModelSmartphoneSize();
        this.modelSmartphoneDtoPrice = modelSmartphone.getModelSmartphonePrice();
        this.modelSmartphoneDtoMemory = modelSmartphone.getModelSmartphoneMemory();
        this.modelSmartphoneDtoNumberOfCameras = modelSmartphone.getModelSmartphoneNumberOfCameras();
        this.modelSmartphoneDtoAvailability = modelSmartphone.isAvailabilityModelSmartphone();
    }
}

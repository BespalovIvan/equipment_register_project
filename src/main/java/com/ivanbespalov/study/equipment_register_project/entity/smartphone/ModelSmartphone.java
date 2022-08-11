package com.ivanbespalov.study.equipment_register_project.entity.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.ModelSmartphoneDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "model_smartphone")
public class ModelSmartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID modelSmartphoneId;
    private String modelSmartphoneName;
    private int modelSmartphoneSerialNumber;
    private String modelSmartphoneColor;
    private String modelSmartphoneSize;
    private int modelSmartphonePrice;
    private String modelSmartphoneMemory;
    private int modelSmartphoneNumberOfCameras;
    private boolean isAvailabilityModelSmartphone;
    public ModelSmartphone() {
    }

    public ModelSmartphone(ModelSmartphoneDto modelSmartphoneDto) {
        this.modelSmartphoneId = modelSmartphoneDto.getModelSmartphoneDtoId();
        this.modelSmartphoneName = modelSmartphoneDto.getModelSmartphoneDtoName();
        this.modelSmartphoneSerialNumber = modelSmartphoneDto.getModelSmartphoneDtoSerialNumber();
        this.modelSmartphoneColor = modelSmartphoneDto.getModelSmartphoneDtoColor();
        this.modelSmartphoneSize = modelSmartphoneDto.getModelSmartphoneDtoSize();
        this.modelSmartphonePrice = modelSmartphoneDto.getModelSmartphoneDtoPrice();
        this.modelSmartphoneMemory = modelSmartphoneDto.getModelSmartphoneDtoMemory();
        this.modelSmartphoneNumberOfCameras = modelSmartphoneDto.getModelSmartphoneDtoNumberOfCameras();
        this.isAvailabilityModelSmartphone = modelSmartphoneDto.isModelSmartphoneDtoAvailability();
    }


}

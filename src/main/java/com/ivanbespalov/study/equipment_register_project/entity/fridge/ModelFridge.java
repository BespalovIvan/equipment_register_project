package com.ivanbespalov.study.equipment_register_project.entity.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.ModelFridgeDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "model_frige")
public class ModelFridge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID modelFridgeId;
    private String modelFridgeName;
    private int modelFridgeSerialNumber;
    private String modelFridgeColor;
    private String modelFridgeSize;
    private int modelFridgePrice;
    private int modelFridgeCountDoor;
    private String modelFridgeCompressorType;
    private boolean isAvailabilityModelFridge;

    public ModelFridge() {
    }

    public ModelFridge(ModelFridgeDto modelFridgeDto) {
        this.modelFridgeId = modelFridgeDto.getModelFridgeDtoId();
        this.modelFridgeName = modelFridgeDto.getModelFridgeDtoName();
        this.modelFridgeColor = modelFridgeDto.getModelFridgeDtoColor();
        this.modelFridgeSize = modelFridgeDto.getModelFridgeDtoSize();
        this.modelFridgePrice = modelFridgeDto.getModelFridgeDtoPrice();
        this.modelFridgeCountDoor = modelFridgeDto.getModelFridgeDtoCountDoor();
        this.modelFridgeCompressorType = modelFridgeDto.getModelFridgeDtoCompressorType();
        this.isAvailabilityModelFridge = modelFridgeDto.isAvailabilityModelFridgeDto();
    }

}

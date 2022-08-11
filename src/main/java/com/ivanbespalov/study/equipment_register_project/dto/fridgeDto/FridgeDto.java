package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.fridge.Fridge;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class FridgeDto {
    @JsonProperty(value = "fridgeId")
    private UUID fridgeDtoId;
    @JsonProperty(value = "fridgeName")
    private String fridgeDtoName;
    @JsonProperty(value = "fridgeCountryOfManufacturer")
    private String fridgeDtoCountryOfManufacturer;
    @JsonProperty(value = "fridgeFirm")
    private String fridgeDtoFirm;
    @JsonProperty(value = "isOrderOnlineFridge")
    private boolean isOrderOnlineFridgeDto;
    @JsonProperty(value = "isCreditFridge")
    private boolean isCreditFridgeDto;
    @JsonProperty(value = "modelsFridges")
    private List<ModelFridgeDto> modelsFridgeDto;

    public FridgeDto(Fridge fridge) {
        this.fridgeDtoId = fridge.getFridgeId();
        this.fridgeDtoName = fridge.getFridgeName();
        this.fridgeDtoCountryOfManufacturer = fridge.getFridgeCountryOfManufacturer();
        this.fridgeDtoFirm = fridge.getFridgeFirm();
        this.isOrderOnlineFridgeDto = fridge.isOrderOnlineFridge();
        this.isCreditFridgeDto = fridge.isCreditFridge();
    }
}

package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class SmartphoneDto {

    @JsonProperty(value = "smartphoneId")
    private UUID smartphoneDtoId;
    @JsonProperty(value = "smartphoneName")
    private String smartphoneDtoName;
    @JsonProperty(value = "smartphoneCountryOfManufacturer")
    private String smartphoneDtoCountryOfManufacturer;
    @JsonProperty(value = "smartphoneFirm")
    private String smartphoneDtoFirm;
    @JsonProperty(value = "smartphoneOrderOnline")
    private boolean smartphoneDtoOrderOnline;
    @JsonProperty(value = "smartphoneCredit")
    private boolean smartphoneDtoCredit;
    @JsonProperty(value = "modelsSmartphones")
    private List<ModelSmartphoneDto> modelSmartphoneDto;

    public SmartphoneDto(Smartphone smartphone) {
        this.smartphoneDtoId = smartphone.getSmartphoneId();
        this.smartphoneDtoName = smartphone.getSmartphoneName();
        this.smartphoneDtoCountryOfManufacturer = smartphone.getSmartphoneCountryOfManufacturer();
        this.smartphoneDtoFirm = smartphone.getSmartphoneFirm();
        this.smartphoneDtoOrderOnline = smartphone.isOrderOnlineSmartphone();
        this.smartphoneDtoCredit = smartphone.isCreditSmartphone();
    }
}

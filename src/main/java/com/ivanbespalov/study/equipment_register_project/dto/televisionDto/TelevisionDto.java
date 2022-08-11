package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.television.Television;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class TelevisionDto {
    @JsonProperty(value = "televisionId")
    private UUID televisionDtoId;
    @JsonProperty(value = "televisionName")
    private String televisionDtoName;
    @JsonProperty(value = "televisionCountryOfManufacturer")
    private String televisionDtoCountryOfManufacturer;
    @JsonProperty(value = "televisionFirm")
    private String televisionDtoFirm;
    @JsonProperty(value = "televisionOrderOnline")
    private boolean televisionDtoOrderOnline;
    @JsonProperty(value = "televisionCredit")
    private boolean televisionDtoCredit;

    @JsonProperty(value = "modelsTelevisions")
    private List<ModelTelevisionDto> modelTelevisionDtoList;

    public TelevisionDto(Television television) {
        this.televisionDtoId = television.getTelevisionId();
        this.televisionDtoName = television.getTelevisionName();
        this.televisionDtoCountryOfManufacturer = television.getTelevisionCountryOfManufacturer();
        this.televisionDtoFirm = television.getTelevisionFirm();
        this.televisionDtoOrderOnline = television.isOrderOnlineTelevision();
        this.televisionDtoCredit = television.isCreditTelevision();
    }
}

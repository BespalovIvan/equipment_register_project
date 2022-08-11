package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.television.ModelTelevision;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ModelTelevisionDto {

    @JsonProperty(value = "modelTelevisionId")
    private UUID modelTelevisionDtoId;

    @JsonProperty(value = "modelTelevisionName")
    private String modelTelevisionDtoName;

    @JsonProperty(value = "modelTelevisionSerialNumber")
    private int modelTelevisionDtoSerialNumber;

    @JsonProperty(value = "modelTelevisionColor")
    private String modelTelevisionDtoColor;

    @JsonProperty(value = "modelTelevisionSize")
    private String modelTelevisionDtoSize;

    @JsonProperty(value = "modelTelevisionName")
    private int modelTelevisionDtoPrice;

    @JsonProperty(value = "modelTelevisionCategory")
    private String modelTelevisionCategory;

    @JsonProperty(value = "modelTelevisionTechnology")
    private String modelTelevisionTechnology;

    public ModelTelevisionDto(ModelTelevision modelTelevision) {
        this.modelTelevisionDtoId = modelTelevision.getModelTelevisionId();
        this.modelTelevisionDtoName = modelTelevision.getModelTelevisionName();
        this.modelTelevisionDtoSerialNumber = modelTelevision.getModelTelevisionSerialNumber();
        this.modelTelevisionDtoColor = modelTelevision.getModelTelevisionColor();
        this.modelTelevisionDtoSize = modelTelevision.getModelTelevisionSize();
        this.modelTelevisionDtoPrice = modelTelevision.getModelTelevisionPrice();
        this.modelTelevisionCategory = modelTelevision.getModelTelevisionCategory();
        this.modelTelevisionTechnology = modelTelevision.getModelTelevisionTechnology();
    }
}

package com.ivanbespalov.study.equipment_register_project.entity.television;

import com.ivanbespalov.study.equipment_register_project.dto.televisionDto.ModelTelevisionDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "model_television")
public class ModelTelevision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID modelTelevisionId;
    private String modelTelevisionName;
    private int modelTelevisionSerialNumber;
    private String modelTelevisionColor;
    private String modelTelevisionSize;
    private int modelTelevisionPrice;
    private String modelTelevisionCategory;
    private String modelTelevisionTechnology;

    public ModelTelevision() {
    }

    public ModelTelevision(ModelTelevisionDto modelTelevisionDto) {
        this.modelTelevisionId = modelTelevisionDto.getModelTelevisionDtoId();
        this.modelTelevisionName = modelTelevisionDto.getModelTelevisionDtoName();
        this.modelTelevisionSerialNumber = modelTelevisionDto.getModelTelevisionDtoSerialNumber();
        this.modelTelevisionColor = modelTelevisionDto.getModelTelevisionDtoColor();
        this.modelTelevisionSize = modelTelevisionDto.getModelTelevisionDtoSize();
        this.modelTelevisionPrice = modelTelevisionDto.getModelTelevisionDtoPrice();
        this.modelTelevisionCategory = modelTelevisionDto.getModelTelevisionCategory();
        this.modelTelevisionTechnology = modelTelevisionDto.getModelTelevisionTechnology();
    }
}

package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.television.ModelTelevision;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelTelevisionDto extends ModelBaseDto {

    private String category;
    private String technology;

    public ModelTelevisionDto(ModelTelevision modelTelevision) {

    }
}

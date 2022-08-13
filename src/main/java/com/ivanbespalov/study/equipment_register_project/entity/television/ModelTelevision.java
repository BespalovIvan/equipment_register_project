package com.ivanbespalov.study.equipment_register_project.entity.television;

import com.ivanbespalov.study.equipment_register_project.dto.televisionDto.ModelTelevisionDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelTelevision extends ModelBase {

    private String Category;
    private String Technology;

    public ModelTelevision(ModelTelevisionDto modelTelevisionDto) {
    }
}

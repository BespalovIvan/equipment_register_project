package com.ivanbespalov.study.equipment_register_project.entity.smartphone;

import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelSmartphone extends ModelBase {

    private String memory;
    private int countOfCameras;

}

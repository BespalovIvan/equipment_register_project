package com.ivanbespalov.study.equipment_register_project.model.tv;

import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class TvModel extends ModelAbstract {

    private String category;
    private String technology;

}

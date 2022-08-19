package com.ivanbespalov.study.equipment_register_project.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class ModelAbstract extends EntityBase {

    private Integer serialNumber;
    private String color;
    private String size;
    private Integer price;
    private boolean isAvailability;

    protected void isAvailability(boolean availability) {
        this.isAvailability = availability;
    }
}

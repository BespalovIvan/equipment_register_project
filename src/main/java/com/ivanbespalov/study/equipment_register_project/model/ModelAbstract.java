package com.ivanbespalov.study.equipment_register_project.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class ModelAbstract extends EntityBase {

    private int serialNumber;
    private String color;
    private String size;
    private int price;
    private boolean isAvailability;

    protected void isAvailability(boolean availability) {
        this.isAvailability = availability;
    }
}

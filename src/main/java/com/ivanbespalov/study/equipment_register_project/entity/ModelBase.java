package com.ivanbespalov.study.equipment_register_project.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class ModelBase extends EntityBase {

    private int serialNumber;
    private String color;
    private String size;
    private int price;
    private boolean isAvailability;
}

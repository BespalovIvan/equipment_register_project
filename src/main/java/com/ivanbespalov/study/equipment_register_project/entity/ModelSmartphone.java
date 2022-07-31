package com.ivanbespalov.study.equipment_register_project.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ModelSmartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int serialNumber;

    private String color;

    private String size;

    private int price;

    private String memory;

    private int numberOfCameras;

    private boolean availability;

}

package com.ivanbespalov.study.equipment_register_project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne
    @JoinColumn(name = "smartphone_id")
    @JsonBackReference
    private Smartphone smartphone;
}

package com.ivanbespalov.study.equipment_register_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String countryOfManufacturer;

    private String firm;

    private boolean orderOnline;

    private boolean credit;

    @OneToMany
    @JsonIgnore
    private List<ModelSmartphone> modelsSmartphone;
}

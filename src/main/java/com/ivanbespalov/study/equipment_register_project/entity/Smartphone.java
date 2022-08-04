package com.ivanbespalov.study.equipment_register_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "smartphone")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;

    private String name;

    private String countryOfManufacturer;

    private String firm;

    private boolean orderOnline;

    private boolean credit;

    @OneToMany
    @JoinColumn(name = "smartphone_id")
    private List<ModelSmartphone> modelSmartphones;

    public Smartphone() {
    }

    public Smartphone(String name,
                      String countryOfManufacturer,
                      String firm,
                      boolean orderOnline,
                      boolean credit) {
        this.name = name;
        this.countryOfManufacturer = countryOfManufacturer;
        this.firm = firm;
        this.orderOnline = orderOnline;
        this.credit = credit;
    }
}

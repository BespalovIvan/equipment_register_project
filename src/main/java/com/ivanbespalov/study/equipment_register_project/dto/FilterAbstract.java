package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;

@Data
public abstract class FilterAbstract {
    private String color;
    private int priceMin;
    private int priceMax;
}

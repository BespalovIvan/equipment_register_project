package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class FilterAbstract {
    private String color;
    private int price;
}

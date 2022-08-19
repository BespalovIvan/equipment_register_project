package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class FilterAbstract {
    private String name;
    private Integer serialNumber;
    private String color;
    private String size;
    private Integer priceMin;
    private Integer priceMax;
}

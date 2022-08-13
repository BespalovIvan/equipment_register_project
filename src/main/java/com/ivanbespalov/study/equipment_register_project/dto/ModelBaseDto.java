package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModelBaseDto extends EntityBaseDto {
    private int serialNumber;
    private String color;
    private String size;
    private int price;
    private boolean isAvailability;

    protected void isAvailability(boolean availability) {
        this.isAvailability = availability;
    }
}

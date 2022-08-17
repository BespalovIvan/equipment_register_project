package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public abstract class ModelAbstractDto extends EntityBaseDto {

    private UUID appliancesId;
    private int serialNumber;
    private String color;
    private String size;
    private int price;
    private boolean isAvailability;

    protected void isAvailability(boolean availability) {
        this.isAvailability = availability;
    }
}

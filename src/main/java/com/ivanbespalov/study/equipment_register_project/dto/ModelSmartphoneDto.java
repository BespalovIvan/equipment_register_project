package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelSmartphoneDto {

    private String name;

    private int serialNumber;

    private String color;

    private String size;

    private int price;

    private String memory;

    private int numberOfCameras;

    private boolean availability;
}

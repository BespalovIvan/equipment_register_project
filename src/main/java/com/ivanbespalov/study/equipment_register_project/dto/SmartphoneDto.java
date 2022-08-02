package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmartphoneDto {

    private String name;

    private String countryOfManufacturer;

    private String firm;

    private boolean orderOnline;

    private boolean credit;

}

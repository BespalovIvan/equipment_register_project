package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppliancesBaseDto extends EntityBaseDto {
    private String countryOfManufacturer;
    private String firm;
    private boolean isOrderOnline;
    private boolean isCredit;
}

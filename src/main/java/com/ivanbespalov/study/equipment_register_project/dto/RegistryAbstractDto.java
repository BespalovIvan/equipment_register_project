package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class RegistryAbstractDto extends EntityBaseDto {
    private String country;
    private String firma;
    private boolean isOnline;
    private boolean isCredit;

    protected void isOnline(boolean orderOnline) {
        this.isOnline = orderOnline;
    }

    protected void isCredit(boolean credit) {
        this.isCredit = credit;
    }
}


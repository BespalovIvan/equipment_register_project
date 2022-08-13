package com.ivanbespalov.study.equipment_register_project.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
@Data
public abstract class AppliancesBase extends EntityBase {

    private String countryOfManufacturer;
    private String firm;
    private boolean isOrderOnline;
    private boolean isCredit;

    public abstract List<ModelBase> getModelAvailability();
}

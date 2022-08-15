package com.ivanbespalov.study.equipment_register_project.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Set;

@MappedSuperclass
@Data
public abstract class RegistryAbstract<T extends ModelAbstract> extends EntityBase {

    private String country;
    private String firma;
    private boolean isOnline;
    private boolean isCredit;

    public abstract Set<T> getModelAvailability();

    public void isOnline(boolean isOrderOnline) {
      this.isOnline = isOrderOnline;
    }

    public void isCredit(boolean isCredit) {
        this.isCredit = isCredit;
    }

}

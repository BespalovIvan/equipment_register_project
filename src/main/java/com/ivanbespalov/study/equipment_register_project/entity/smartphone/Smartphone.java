package com.ivanbespalov.study.equipment_register_project.entity.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.AppliancesBase;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class Smartphone extends AppliancesBase {
    @OneToMany
    @JoinColumn(name = "smartphone_id")
    private List<ModelSmartphone> modelSmartphones;

    public Smartphone(SmartphoneDto smartphoneDto) {
        this.setName(smartphoneDto.getName());
        this.setCountryOfManufacturer(smartphoneDto.getCountryOfManufacturer());
        this.setFirm(smartphoneDto.getFirm());
        this.isOrderOnline(smartphoneDto.isOrderOnline());
        this.isCredit(smartphoneDto.isCredit());
    }

    @Override
    public List<ModelBase> getModelAvailability() {
        return modelSmartphones.stream()
                .filter(ModelBase::isAvailability)
                .collect(Collectors.toList());
    }
}

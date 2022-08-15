package com.ivanbespalov.study.equipment_register_project.model.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import com.ivanbespalov.study.equipment_register_project.model.RegistryAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class Smartphone extends RegistryAbstract {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "smartphone_id")
    private Set<SmartphoneModel> models;

    public Smartphone(SmartphoneDto smartphoneDto) {
        this.setName(smartphoneDto.getName());
        this.setCountry(smartphoneDto.getCountry());
        this.setFirma(smartphoneDto.getFirma());
        this.isOnline(smartphoneDto.isOnline());
        this.isCredit(smartphoneDto.isCredit());
    }

    public Smartphone(String name, String country, String firma, boolean online, boolean credit) {
        this.setName(name);
        this.setCountry(country);
        this.setFirma(firma);
        this.isOnline(online);
        this.isCredit(credit);
    }

    @Override
    public Set<ModelAbstract> getModelAvailability() {
        return models.stream()
                .filter(ModelAbstract::isAvailability)
                .collect(Collectors.toSet());
    }
}

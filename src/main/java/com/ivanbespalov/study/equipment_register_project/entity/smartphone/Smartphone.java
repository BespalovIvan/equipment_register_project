package com.ivanbespalov.study.equipment_register_project.entity.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "smartphone")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID smartphoneId;
    private String smartphoneName;
    private String smartphoneCountryOfManufacturer;
    private String smartphoneFirm;
    private boolean isOrderOnlineSmartphone;
    private boolean isCreditSmartphone;
    @OneToMany
    @JoinColumn(name = "smartphone_id")
    private List<ModelSmartphone> modelSmartphones;
    public Smartphone() {
    }
    public Smartphone(SmartphoneDto smartphoneDto) {
        this.smartphoneName = smartphoneDto.getSmartphoneDtoName();
        this.smartphoneCountryOfManufacturer = smartphoneDto.getSmartphoneDtoCountryOfManufacturer();
        this.smartphoneFirm = smartphoneDto.getSmartphoneDtoFirm();
        this.isOrderOnlineSmartphone = smartphoneDto.isSmartphoneDtoOrderOnline();
        this.isCreditSmartphone = smartphoneDto.isSmartphoneDtoCredit();
    }
}

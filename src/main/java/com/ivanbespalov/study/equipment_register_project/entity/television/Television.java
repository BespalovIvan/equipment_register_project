package com.ivanbespalov.study.equipment_register_project.entity.television;

import com.ivanbespalov.study.equipment_register_project.dto.televisionDto.TelevisionDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "television")
public class Television {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID televisionId;
    private String televisionName;
    private String televisionCountryOfManufacturer;
    private String televisionFirm;
    private boolean isOrderOnlineTelevision;
    private boolean isCreditTelevision;
    @OneToMany
    @JoinColumn(name = "television_id")
    private List<ModelTelevision> modelTelevisions;

    public Television() {
    }

    public Television(TelevisionDto televisionDto) {
        this.televisionName = televisionDto.getTelevisionDtoName();
        this.televisionCountryOfManufacturer = televisionDto.getTelevisionDtoCountryOfManufacturer();
        this.televisionFirm = televisionDto.getTelevisionDtoFirm();
        this.isOrderOnlineTelevision = televisionDto.isTelevisionDtoOrderOnline();
        this.isCreditTelevision = televisionDto.isTelevisionDtoCredit();
    }
}

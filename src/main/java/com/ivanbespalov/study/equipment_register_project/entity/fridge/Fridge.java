package com.ivanbespalov.study.equipment_register_project.entity.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "fridge")
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID fridgeId;
    private String fridgeName;
    private String fridgeCountryOfManufacturer;
    private String fridgeFirm;
    private boolean isOrderOnlineFridge;
    private boolean isCreditFridge;
    @OneToMany
    @JoinColumn(name = "fridge_id")
    private List<ModelFridge> modelFridges;

    public Fridge() {
    }
    public Fridge(FridgeDto fridgeDto) {
        this.fridgeName = fridgeDto.getFridgeDtoName();
        this.fridgeCountryOfManufacturer = fridgeDto.getFridgeDtoCountryOfManufacturer();
        this.fridgeFirm = fridgeDto.getFridgeDtoFirm();
        this.isOrderOnlineFridge = fridgeDto.isOrderOnlineFridgeDto();
        this.isCreditFridge = fridgeDto.isCreditFridgeDto();
    }
}

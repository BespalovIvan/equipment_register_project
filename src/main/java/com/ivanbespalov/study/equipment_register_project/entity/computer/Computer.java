package com.ivanbespalov.study.equipment_register_project.entity.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID computerId;
    private String computerName;
    private String computerCountryOfManufacturer;
    private String computerFirm;
    private boolean isOrderOnlineComputer;
    private boolean isCreditComputer;
    @OneToMany
    @JoinColumn(name = "computer_id")
    private List<ModelComputer> modelComputers;

    public Computer() {
    }

    public Computer(ComputerDto computerDto) {
        this.computerName = computerDto.getComputerDtoName();
        this.computerCountryOfManufacturer = computerDto.getComputerDtoCountryOfManufacturer();
        this.computerFirm = computerDto.getComputerDtoFirm();
        this.isOrderOnlineComputer = computerDto.isOrderOnlineComputerDto();
        this.isCreditComputer = computerDto.isCreditComputerDto();
    }

}

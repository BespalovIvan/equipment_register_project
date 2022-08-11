package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.computer.Computer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class ComputerDto {
    @JsonProperty(value = "computerId")
    private UUID computerDtoId;
    @JsonProperty(value = "computerName")
    private String computerDtoName;
    @JsonProperty(value = "computerCountryOfManufacturer")
    private String computerDtoCountryOfManufacturer;
    @JsonProperty(value = "computerFirm")
    private String computerDtoFirm;
    @JsonProperty(value = "isOrderOnlineComputer")
    private boolean isOrderOnlineComputerDto;
    @JsonProperty(value = "isCreditComputer")
    private boolean isCreditComputerDto;
    @JsonProperty(value = "modelsComputers")
    private List<ModelComputerDto> modelsComputerDto;


    public ComputerDto(Computer computer) {
        this.computerDtoId = computer.getComputerId();
        this.computerDtoName = computer.getComputerName();
        this.computerDtoCountryOfManufacturer = computer.getComputerCountryOfManufacturer();
        this.computerDtoFirm = computer.getComputerFirm();
        this.isOrderOnlineComputerDto = computer.isOrderOnlineComputer();
        this.isCreditComputerDto = computer.isCreditComputer();
    }
}

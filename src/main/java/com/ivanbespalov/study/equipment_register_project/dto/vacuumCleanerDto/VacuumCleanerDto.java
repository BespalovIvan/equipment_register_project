package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner.VacuumCleaner;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class VacuumCleanerDto {
    @JsonProperty(value = "vacuumCleanerId")
    private UUID vacuumCleanerDtoId;
    @JsonProperty(value = "vacuumCleanerName")
    private String vacuumCleanerDtoName;
    @JsonProperty(value = "vacuumCleanerCountryOfManufacturer")
    private String vacuumCleanerDtoCountryOfManufacturer;
    @JsonProperty(value = "vacuumCleanerFirm")
    private String vacuumCleanerDtoFirm;
    @JsonProperty(value = "vacuumCleanerOrderOnline")
    private boolean vacuumCleanerDtoOrderOnline;
    @JsonProperty(value = "vacuumCleanerCredit")
    private boolean vacuumCleanerDtoCredit;
    @JsonProperty(value = "modelsVacuumCleaner")
    private List<ModelVacuumCleanerDto> modelVacuumCleanerDto;

    public VacuumCleanerDto(VacuumCleaner vacuumCleaner) {
        this.vacuumCleanerDtoId = vacuumCleaner.getVacuumCleanerId();
        this.vacuumCleanerDtoName = vacuumCleaner.getVacuumCleanerName();
        this.vacuumCleanerDtoCountryOfManufacturer = vacuumCleaner.getVacuumCleanerCountryOfManufacturer();
        this.vacuumCleanerDtoFirm = vacuumCleaner.getVacuumCleanerFirm();
        this.vacuumCleanerDtoOrderOnline = vacuumCleaner.isOrderOnlineVacuumCleaner();
        this.vacuumCleanerDtoCredit = vacuumCleaner.isCreditVacuumCleaner();
    }
}

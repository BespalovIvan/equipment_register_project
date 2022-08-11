package com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto.VacuumCleanerDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "vacuum_cleaner")
public class VacuumCleaner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID vacuumCleanerId;
    private String vacuumCleanerName;
    private String vacuumCleanerCountryOfManufacturer;
    private String vacuumCleanerFirm;
    private boolean isOrderOnlineVacuumCleaner;
    private boolean isCreditVacuumCleaner;
    @OneToMany
    @JoinColumn(name = "vacuum_cleaner_id")
    private List<ModelVacuumCleaner> modelVacuumCleaners;

    public VacuumCleaner() {
    }
    public VacuumCleaner(VacuumCleanerDto vacuumCleanerDto) {
        this.vacuumCleanerName = vacuumCleanerDto.getVacuumCleanerDtoName();
        this.vacuumCleanerCountryOfManufacturer = vacuumCleanerDto.getVacuumCleanerDtoCountryOfManufacturer();
        this.vacuumCleanerFirm = vacuumCleanerDto.getVacuumCleanerDtoFirm();
        this.isOrderOnlineVacuumCleaner = vacuumCleanerDto.isVacuumCleanerDtoOrderOnline();
        this.isCreditVacuumCleaner = vacuumCleanerDto.isVacuumCleanerDtoCredit();
    }
}

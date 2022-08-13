package com.ivanbespalov.study.equipment_register_project.entity.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
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
public class Computer extends AppliancesBase {
    @OneToMany
    @JoinColumn(name = "computer_id")
    private List<ModelComputer> modelComputers;

    public Computer(ComputerDto computerDto) {

    }

    @Override
    public List<ModelBase> getModelAvailability() {
        return modelComputers
                .stream()
                .filter(ModelBase::isAvailability)
                .collect(Collectors.toList());
    }
}

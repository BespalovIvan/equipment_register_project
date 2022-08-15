package com.ivanbespalov.study.equipment_register_project.model.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
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
public class Computer extends RegistryAbstract<ComputerModel> {
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "computer_id")
    private Set<ComputerModel> computerModels;

    public Computer(ComputerDto computerDto) {
        this.setName(computerDto.getName());
        this.setCountry(computerDto.getCountry());
        this.setFirma(computerDto.getFirma());
        this.isOnline(computerDto.isOnline());
        this.isCredit(computerDto.isCredit());
    }

    @Override
    public Set<ComputerModel> getModelAvailability() {
        return computerModels
                .stream()
                .filter(ModelAbstract::isAvailability)
                .collect(Collectors.toSet());
    }
}

package com.ivanbespalov.study.equipment_register_project.dto.computerDto;


import com.ivanbespalov.study.equipment_register_project.dto.FilterAbstract;
import lombok.Data;

@Data
public class ComputerFilterDto extends FilterAbstract {
    private String category;
    private String cpu;
}

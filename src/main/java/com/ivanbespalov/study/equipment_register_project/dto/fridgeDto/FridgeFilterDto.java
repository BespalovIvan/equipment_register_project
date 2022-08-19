package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.ivanbespalov.study.equipment_register_project.dto.FilterAbstract;
import lombok.Data;

@Data
public class FridgeFilterDto extends FilterAbstract {
    private Integer countDoor;
    private String compressorType;
}

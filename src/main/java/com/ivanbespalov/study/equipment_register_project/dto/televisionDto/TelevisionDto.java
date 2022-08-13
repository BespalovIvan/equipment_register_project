package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.television.Television;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TelevisionDto extends AppliancesBaseDto {

    private List<ModelTelevisionDto> modelTelevisionDtoList;

    public TelevisionDto(Television television) {

    }
}

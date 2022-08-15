package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.ivanbespalov.study.equipment_register_project.dto.RegistryAbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class TvDto extends RegistryAbstractDto {

    private Set<TvModelDto> tvModelDtoList;

}

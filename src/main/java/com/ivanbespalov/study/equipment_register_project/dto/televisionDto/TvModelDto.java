package com.ivanbespalov.study.equipment_register_project.dto.televisionDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelAbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TvModelDto extends ModelAbstractDto {

    private String category;
    private String technology;

}

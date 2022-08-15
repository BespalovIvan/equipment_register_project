package com.ivanbespalov.study.equipment_register_project.dto;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class EntityBaseDto {
    private UUID id;
    private String name;
}

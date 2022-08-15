package com.ivanbespalov.study.equipment_register_project.controller.tvController;

import com.ivanbespalov.study.equipment_register_project.service.tvServise.TvModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/televisions")
public class TvModelController {
    private final TvModelService tvModelService;

    public TvModelController(TvModelService tvModelService) {
        this.tvModelService = tvModelService;
    }
}

package com.ivanbespalov.study.equipment_register_project.controller.tvController;

import com.ivanbespalov.study.equipment_register_project.service.tvServise.TvService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TvController {
    private final TvService tvService;

    public TvController(TvService tvService) {
        this.tvService = tvService;
    }
}

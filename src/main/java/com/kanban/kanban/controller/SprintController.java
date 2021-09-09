package com.kanban.kanban.controller;

import com.kanban.kanban.service.SprintService;
import com.kanban.kanban.viewmodel.SprintVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/sprints")
public class SprintController {

    @Autowired
    private SprintService sprintService;

    @PostMapping
    public void create(@RequestBody SprintVM sprintVM) {
        sprintService.create(sprintVM);
    }
}

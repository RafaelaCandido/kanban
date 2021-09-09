package com.kanban.kanban.controller;

import com.kanban.kanban.repository.TaskRepository;
import com.kanban.kanban.service.TaskService;
import com.kanban.kanban.viewmodel.TaskVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public void create(@RequestBody TaskVM taskVM) {
        taskService.create(taskVM);
    }
}

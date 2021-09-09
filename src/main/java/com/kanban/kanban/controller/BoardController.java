package com.kanban.kanban.controller;

import com.kanban.kanban.service.BoardService;
import com.kanban.kanban.viewmodel.BoardVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public void create(@RequestBody BoardVM boardVM) {
        boardService.create(boardVM);
    }
}

package com.kanban.kanban.controller;

import com.kanban.kanban.model.Board;
import com.kanban.kanban.service.BoardService;
import com.kanban.kanban.viewmodel.BoardVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/v1/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public void create(@RequestBody BoardVM boardVM) {
        boardService.create(boardVM);
    }

    @GetMapping
    public List<BoardVM> list() {
        List<Board> boards = boardService.listBoards();

        List<BoardVM> boardVMS = boards.stream().map(temp -> {
            BoardVM obj = new BoardVM();
            obj.setId(temp.getId());
            obj.setTitle(temp.getTitle());
            return obj;
        }).collect(Collectors.toList());

        return boardVMS;
    }
}

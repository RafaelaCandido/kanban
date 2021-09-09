package com.kanban.kanban.service;

import com.kanban.kanban.model.Board;
import com.kanban.kanban.model.Sprint;
import com.kanban.kanban.repository.SprintRepository;
import com.kanban.kanban.viewmodel.SprintVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SprintService {

    @Autowired
    private SprintRepository sprintRepository;

    public void create(SprintVM sprintVM) {
        Sprint sprintToSave = new Sprint();
        Board savedBoard = new Board();
        savedBoard.setId(sprintVM.getBoardId());
        sprintToSave.setBoard(savedBoard);
        sprintToSave.setStartDate(sprintVM.getStartDate());
        sprintToSave.setEndDate(sprintVM.getEndDate());
        sprintRepository.save(sprintToSave);
    }
}

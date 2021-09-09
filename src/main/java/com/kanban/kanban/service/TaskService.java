package com.kanban.kanban.service;

import com.kanban.kanban.model.Board;
import com.kanban.kanban.model.Sprint;
import com.kanban.kanban.model.Task;
import com.kanban.kanban.model.User;
import com.kanban.kanban.repository.TaskRepository;
import com.kanban.kanban.viewmodel.TaskVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void create(TaskVM taskVM) {
       Task taskToSave = new Task();
       taskToSave.setTitle(taskVM.getTitle());
       taskToSave.setDate(taskVM.getDate());
       taskToSave.setStatus(taskVM.getStatus());
       taskToSave.setColor(taskVM.getColor());

       Board savedBoard = new Board();
       savedBoard.setId(taskVM.getBoardId());
       taskToSave.setBoard(savedBoard);

       Sprint savedSprint = new Sprint();
       savedSprint.setId(taskVM.getSprintId());
       taskToSave.setSprint(savedSprint);

       User savedUser = new User();
       savedUser.setId(taskVM.getOwnerId());
       taskToSave.setOwner(savedUser);

       taskRepository.save(taskToSave);
    }
}

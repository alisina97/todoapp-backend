package com.alisina.todoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todoapp")
public class TasksController {
    @Autowired
    TaskRepository repository;

    @GetMapping
    public ResponseEntity<List<Tasks>> getAll() {
        return new ResponseEntity<List<Tasks>>(repository.findAll(), HttpStatus.OK);
    }
}

package com.alisina.todoapp;

import com.mongodb.client.model.Collation;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "tasks")
public class Task {
    @Id
    private ObjectId id;
    private String name;
    private Date duedate;
}

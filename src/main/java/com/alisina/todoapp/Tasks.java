package com.alisina.todoapp;

import com.mongodb.client.model.Collation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tasks")
@Data
public class Tasks {
    @Id
    private ObjectId id;
    private String name;
    private String duedate;
}

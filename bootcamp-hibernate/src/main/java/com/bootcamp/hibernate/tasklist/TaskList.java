package com.bootcamp.hibernate.tasklist;

import com.bootcamp.hibernate.task.Task;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskList {
    @Id
    @GeneratedValue
    private int id;
    private String listName;
    private String description;
    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Task> tasks = new ArrayList<>();

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    public int getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

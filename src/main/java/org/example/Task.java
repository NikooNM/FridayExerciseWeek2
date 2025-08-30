package org.example;

import lombok.Data;

import java.time.LocalDate;

@Data

public class Task {
    String title;
    String description;
    LocalDate dueDate;

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }
}

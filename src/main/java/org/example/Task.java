package org.example;

import java.time.LocalDate;

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

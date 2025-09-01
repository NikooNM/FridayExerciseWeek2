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

    @Override
    public String toString() {
        return "Task \n Title: " + getTitle() + "\n"
                + " description: " + getDescription() + "\n"
                + " dueDate: " + getDueDate() + "\n";
    }
}

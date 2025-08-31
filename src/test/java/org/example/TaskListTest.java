package org.example;

import org.example.generics.TaskList;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest<T> {
    TaskList instance = new TaskList();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("First test of TaskList class: Add tasks to the list")
    public void addToList(){
        Task taskTest = new Task("Test Task",
                "This is the description for the test task",
                LocalDate.now().plusDays(3));

        List<Task> taskListTest = instance.addToList(taskTest);

        Task actual = taskListTest.get(taskListTest.size()-1);
        Task expected = taskTest;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second test: Filter tasks based on keywords in title or description")
    public void filterBasedOnKeyword(){
        String keyword = "do";

        List<T> actual = instance.filterBasedOnKeyword(keyword);
        //List<T> expected =
        //assertEquals(expected, actual);

        //Erstat de to kommentarer ovenfor med kode der passer
    }

    //Brug samme struktur som testen til de andre tests.
    //Husk at de koder bagfra: først test, så metoder i klassen osv.

}

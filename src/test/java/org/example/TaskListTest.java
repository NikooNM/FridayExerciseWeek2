package org.example;

import org.example.generics.TaskList;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest<T> {
    TaskList instance = new TaskList();

    Task taskTest1 = new Task("Test Task 1",
            "This is the description for the first test task",
            LocalDate.now().plusDays(0));

    GardenTask taskTest2 = new GardenTask("Test Task 2",
            "This is the description for the second test task",
            LocalDate.now().plusDays(-1), "Test");

    Task taskTest3 = new Task("Test Task 3",
            "This is the description for the third test task",
            LocalDate.now().plusDays(0));

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("First test of TaskList class: Add tasks to the list")
    public void addToList(){
        List<Task> taskListTest = instance.addToList(taskTest1);

        Task actual = taskListTest.get(taskListTest.size()-1);
        Task expected = taskTest1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second test: Filter tasks based on keywords in title or description")
    public void filterBasedOnKeyword(){
        String keyword = "test";

        instance.addToList(taskTest1);
        instance.addToList(taskTest2);

        List<T> actual = instance.filterBasedOnKeyword(keyword);
        List<T> expected = (List<T>) List.of(taskTest1, taskTest2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Third test: Sort tasks by due date")
    public void sortByDate(){
        instance.addToList(taskTest1);
        //instance.addToList(taskTest2);
        instance.addToList(taskTest3);

        List<T> actual = instance.sortByDate();
        List<T> expected = (List<T>) List.of(taskTest1, taskTest3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Fourth test: Get tasks due today")
    public void getDueTodayTasks(){
        instance.addToList(taskTest1);
        instance.addToList(taskTest2);

        List<T> actual = instance.getDueTodayTasks();
        List<T> expected = (List<T>) List.of(taskTest1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Fifth and last test: Get tasks that are overdue")
    public void getOverdueTasks(){
        instance.addToList(taskTest1);
        instance.addToList(taskTest2);

        List<T> actual = instance.getOverdueTasks();
        List<T> expected = (List<T>) List.of(taskTest2);
        assertEquals(expected, actual);
    }
    //God tommelfingerregel - Ved TDD koder man bagfra: først test, så metoder i klassen osv.
}

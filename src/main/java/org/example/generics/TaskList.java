package org.example.generics;

import org.example.Task;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskList<T extends Task> implements TaskListData<T>, Iterable<T> {
    private T data;
    private List<T> actualTaskList = new ArrayList<>();

    //First function: Add task
    public List<T> addToList(T taskToAdd) {
        actualTaskList.add(taskToAdd);
        return actualTaskList;
    }

    //Second function: Filter based on word
    public List<T> filterBasedOnKeyword(String keyword) {
        List<T> filteredList = new ArrayList<>();

        actualTaskList
                .stream()
                .filter(e -> e.toString().toLowerCase().contains(keyword.toLowerCase()))
                .forEach(filteredList::add);

        return filteredList;
    }

    //Third function: Sort by date (ascending)
    public List<T> sortByDate(){
        List<T> taskListSortedByDate = actualTaskList
                .stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());

        return taskListSortedByDate;
    }

    //Fourth function: Get tasks due today
    public List<T> getDueTodayTasks(){

        return actualTaskList.stream()
                .filter(t -> t.getDueDate().isEqual(LocalDate.now()))
                .collect(Collectors.toList());
    }

    //Fifth function: Get tasks that are overdue
    public List<T> getOverdueTasks() {

        return actualTaskList
                .stream()
                .filter(t -> t.getDueDate().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }

    //Other methods
    //TaskListData methods
    @Override
    public Object store(T data) {
        return null;
    }

    @Override
    public T retrieve(String source) {
        return null;
    }

    //Iterable method
    @Override
    public Iterator<T> iterator() {
        return actualTaskList.iterator();
    }

    //Short method that prints the task list (it is called many times throughout the main method)
    public void printList(){
        for (T task : actualTaskList){
            System.out.println(task);
        }
        System.out.println("*new operation* \n"); //Line that separates output code to make it more readable
    }

    //Same method above, but overloaded
    public void printList(List<T> listToPrint){
        for (T task : listToPrint){
            System.out.println(task);
        }
        System.out.println("*new operation* \n"); //Line that separates output code to make it more readable
    }
}
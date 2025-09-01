package org.example.generics;

import org.example.Task;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TaskList<T> implements TaskListData<T>, Iterable<T> {
    private T data;
    private List<T> actualTaskList = new ArrayList<>();

    public List<T> addToList(T taskToAdd) {
        actualTaskList.add(taskToAdd);
        return actualTaskList;
    }

    public List<T> filterBasedOnKeyword(String keyword) {
        List<T> filteredList = new ArrayList<>();

        actualTaskList
                .stream()
                .filter(e -> e.toString().toLowerCase().contains(keyword.toLowerCase()))
                .forEach(filteredList::add);

        return filteredList;
    }

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
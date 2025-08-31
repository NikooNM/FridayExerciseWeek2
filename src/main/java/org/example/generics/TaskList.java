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

    public List<T> filterBasedOnKeyword(String keyword){
        List<T> filteredList = new ArrayList<>();

        actualTaskList
                .stream()
                .filter( e -> e.equals(keyword))
                .forEach(filteredList::add);

        return filteredList;
    }

    //TaskListData metoder
    @Override
    public Object store(T data) {
        return null;
    }

    @Override
    public T retrieve(String source) {
        return null;
    }

    //Iterable metoder
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}

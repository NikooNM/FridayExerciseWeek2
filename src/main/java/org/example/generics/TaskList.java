package org.example.generics;

import org.example.Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TaskList<T> implements TaskListData<T>, Iterable<T> {
    private T data;

    public List<T> addToList(T taskToAdd) {
        List<T> actualTaskList = new ArrayList<>();
        actualTaskList.add(taskToAdd);

        return actualTaskList;


    }

    //TaskLstData metoder
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

package org.example;

import org.example.generics.TaskList;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskList<Task> toDoList = new TaskList<>();

        Task doLaundry = new Task("Do laundry",
                "Take used and dirty clothing from the laundry basket and wash/dry them in the shared laundry",
                LocalDate.now().plusDays(2));

        GardenTask removeWeeds = new GardenTask("Remove weeds from backyard",
                "Pull out weeds from your garden and cut the grass if you're not tired",
                LocalDate.now(),
                "Mørkhøj");


        //Operation 1: Add tasks
        toDoList.addToList(doLaundry);
        toDoList.addToList(removeWeeds);
        toDoList.printList();

        //Operation 2: Filter tasks based on a keyword in title/description
        toDoList.printList(toDoList.filterBasedOnKeyword("do"));

        //Operation 3:
    }
}
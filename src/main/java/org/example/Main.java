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

        Task goToGym = new Task("Go to gym",
                "Go to gym tomorrow afternoon and do your workout A, B or C depending on the day of the week",
                LocalDate.now().plusDays(-1));

        Task doCleaning = new Task("Do a deep clean of your home",
                "Vacuum the house as soon as possible and clean it entirely",
                LocalDate.now());

        GardenTask removeWeeds = new GardenTask("Remove weeds from backyard",
                "Pull out weeds from your garden and cut the grass if you're not tired",
                LocalDate.now(),
                "Mørkhøj");

        GardenTask growStrawberries = new GardenTask("Grow strawberries in your small garden",
                "Plant strawberries, water them consistently and see them give you fruit",
                LocalDate.now().plusDays(90),
                "Søborg");

        //Operation 1: Add tasks
        toDoList.addToList(doLaundry);
        toDoList.addToList(goToGym);
        toDoList.addToList(doCleaning);
        toDoList.addToList(removeWeeds);
        toDoList.addToList(growStrawberries);

        toDoList.printList();

        //Operation 2: Filter tasks based on a keyword in title/description
        toDoList.printList(toDoList.filterBasedOnKeyword("garden"));

        //Operation 3: Sort tasks by due date
        toDoList.printList(toDoList.sortByDate());

        //Operation 4: Get tasks due today
        toDoList.printList(toDoList.getDueTodayTasks());

        //Operation 5: Get overdue tasks
        toDoList.printList(toDoList.getOverdueTasks());
    }
}
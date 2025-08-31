package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task doLaundry = new Task("Do laundry",
                "Take used and dirty clothing from the laundry basket and wash/dry them in the shared laundry",
                LocalDate.now().plusDays(2));

        GardenTask removeWeeds = new GardenTask("Remove weeds from backyard",
                "Pull out weeds from your garden and cut the grass if you're not tired",
                LocalDate.now(),
                "Mørkhøj");
    }
}
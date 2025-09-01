package org.example;

import java.time.LocalDate;

public class GardenTask extends Task {
    private String gardenLocation;

    public GardenTask(String title, String description, LocalDate dueDate, String gardenLocation){
        super(title, description, dueDate);
        this.gardenLocation = gardenLocation;
    }

    @Override
    public String toString() {
        return "GardenTask \n Title: " + getTitle() + "\n"
                + " description: " + getDescription() + "\n"
                + " dueDate: " + getDueDate() + "\n"
                + " location: " + getGardenLocation() + "\n";
    }

    public String getGardenLocation() {
        return gardenLocation;
    }
}

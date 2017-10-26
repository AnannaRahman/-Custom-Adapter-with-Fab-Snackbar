package com.example.ananna.customadapter.model;

/**
 * Created by Ananna on 10/25/2017.
 */

public class Cricketer {
    public Cricketer(int imageID, String name) {
        this.imageID = imageID;
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int imageID;
    private String name;


}

package com.example.hamiltonlima.listsomedata;

/**
 * Created by hamiltonlima on 2017-07-09.
 */

public class Task {

    static int lastId = 0;

    private int id;
    private String name;
    private String color;
    private boolean done;

    public Task(String name) {
        this.id = Task.lastId++;
        this.name = name;
        this.color = "#000000";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}

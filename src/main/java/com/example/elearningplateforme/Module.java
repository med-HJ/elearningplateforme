package com.example.elearningplateforme;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private static long idCounter = 0;
    private long id;
    private String title;
    private List<Lesson> lessons;

    public Module(String title) {
        this.id = ++idCounter;
        this.title = title;
        this.lessons = new ArrayList<>();
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Module.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
// Constructors, getters, and setters...
}

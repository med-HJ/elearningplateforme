package com.example.elearningplateforme;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static long idCounter = 0;
    private long id;
    private String title;
    private List<Module> modules;
    private List<Course> prerequisites;

    public Course(String title) {
        this.id = ++idCounter;
        this.title = title;
        this.modules = new ArrayList<>();
        this.prerequisites = new ArrayList<>();
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Course.idCounter = idCounter;
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
// Constructors, getters, and setters...
}

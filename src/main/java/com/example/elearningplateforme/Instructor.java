package com.example.elearningplateforme;

public class Instructor {
    private static long idCounter = 0;
    private long id;
    private String name;

    public Instructor(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    // Constructors, getters, and setters...

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Instructor.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
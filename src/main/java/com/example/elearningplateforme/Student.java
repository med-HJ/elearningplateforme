package com.example.elearningplateforme;

public class Student {
    private static long idCounter = 0;
    private long id;
    private String name;

    public Student(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Student.idCounter = idCounter;
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

    // Constructors, getters, and setters...
}
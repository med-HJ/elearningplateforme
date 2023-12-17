package com.example.elearningplateforme;

public class Discussion {
    private static long idCounter = 0;
    private long id;
    private String title;
    private Course course;

    public Discussion(String title, Course course) {
        this.id = ++idCounter;
        this.title = title;
        this.course = course;
    }

    // Constructors, getters, and setters...

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Discussion.idCounter = idCounter;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

package com.example.elearningplateforme;

public class Lesson {
    private static long idCounter = 0;
    private long id;
    private String title;
    private String content;

    public Lesson(String title, String content) {
        this.id = ++idCounter;
        this.title = title;
        this.content = content;
    }

    // Constructors, getters, and setters...

    public static long getIdCounter() {
        return idCounter;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void setIdCounter(long idCounter) {
        Lesson.idCounter = idCounter;
    }
}

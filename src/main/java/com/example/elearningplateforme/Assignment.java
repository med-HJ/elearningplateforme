package com.example.elearningplateforme;

import java.util.ArrayList;
import java.util.List;

public  class Assignment {
    private static long idCounter = 0;
    private long id;
    private String title;
    private Course course;
    private List<Submission> submissions;

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Assignment.idCounter = idCounter;
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

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public Assignment(String title, Course course) {
        this.id = ++idCounter;
        this.title = title;
        this.course = course;
        this.submissions = new ArrayList<>();
    }

    // Constructors, getters, and setters...

    public void submitSolution(Enrollment enrollment, String content) {
        // Logic for submitting assignment solution
        Submission submission = new Submission(enrollment, content);
        submissions.add(submission);
    }
}
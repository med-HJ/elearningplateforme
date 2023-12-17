package com.example.elearningplateforme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enrollment {
    private static long idCounter = 0;
    private long id;
    private Student student;
    private Course course;
    private Map<Long, Double> assessments;
    private List<Assignment> assignments;

    public Enrollment(Student student, Course course) {
        this.id = ++idCounter;
        this.student = student;
        this.course = course;
        this.assessments = new HashMap<>();
        this.assignments = new ArrayList<>();
    }

    // Constructors, getters, and setters...

    public void submitAssessment(double score) {
        // Logic for submitting assessment
        assessments.put(System.currentTimeMillis(), score);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Enrollment.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Map<Long, Double> getAssessments() {
        return assessments;
    }

    public void setAssessments(Map<Long, Double> assessments) {
        this.assessments = assessments;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
}
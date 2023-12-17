package com.example.elearningplateforme;

public class Submission {
    private Enrollment enrollment;
    private String content;

    public Submission(Enrollment enrollment, String content) {
        this.enrollment = enrollment;
        this.content = content;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

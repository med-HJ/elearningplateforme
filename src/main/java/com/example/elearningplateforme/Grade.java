package com.example.elearningplateforme;

public class Grade {
private Enrollment enrollment;
private double finalGrade;

public Grade(Enrollment enrollment, double finalGrade) {
        this.enrollment = enrollment;
        this.finalGrade = finalGrade;
        }

        // Constructors, getters, and setters...

        public Enrollment getEnrollment() {
                return enrollment;
        }

        public void setEnrollment(Enrollment enrollment) {
                this.enrollment = enrollment;
        }

        public double getFinalGrade() {
                return finalGrade;
        }

        public void setFinalGrade(double finalGrade) {
                this.finalGrade = finalGrade;
        }
}
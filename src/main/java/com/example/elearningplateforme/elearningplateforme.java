package com.example.elearningplateforme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api/learning")
public class elearningplateforme {

	private Map<Long, Course> courses = new HashMap<>();
	private Map<Long, Instructor> instructors = new HashMap<>();
	private Map<Long, Student> students = new HashMap<>();
	private Map<Long, Enrollment> enrollments = new HashMap<>();
	private Map<Long, Discussion> discussions = new HashMap<>();
	private Map<Long, Assignment> assignments = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(elearningplateforme.class, args);
	}

	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		courses.put(course.getId(), course);
		return "Course added successfully!";
	}

	@GetMapping("/getCourses")
	public List<Course> getCourses() {
		return new ArrayList<>(courses.values());
	}

	@PostMapping("/addInstructor")
	public String addInstructor(@RequestBody Instructor instructor) {
		instructors.put(instructor.getId(), instructor);
		return "Instructor added successfully!";
	}

	@GetMapping("/getInstructors")
	public List<Instructor> getInstructors() {
		return new ArrayList<>(instructors.values());
	}

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		students.put(student.getId(), student);
		return "Student added successfully!";
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return new ArrayList<>(students.values());
	}

	@PostMapping("/enrollStudent")
	public String enrollStudent(@RequestParam long studentId, @RequestParam long courseId, @RequestParam EnrollmentType enrollmentType) {
		if (students.containsKey(studentId) && courses.containsKey(courseId)) {
			Student student = students.get(studentId);
			Course course = courses.get(courseId);

			// Check prerequisites for enrollment
			if (!canEnroll(student, course)) {
				return "Student does not meet prerequisites for this course!";
			}

			Enrollment enrollment;
			if (enrollmentType == EnrollmentType.CREDIT) {
				enrollment = new CreditEnrollment(student, course);
			} else {
				enrollment = new AuditEnrollment(student, course);
			}

			enrollments.put(enrollment.getId(), enrollment);
			return "Student enrolled successfully!";
		} else {
			return "Student or course not found!";
		}
	}

	@GetMapping("/getEnrollments")
	public List<Enrollment> getEnrollments() {
		return new ArrayList<>(enrollments.values());
	}

	@PostMapping("/createDiscussion")
	public String createDiscussion(@RequestParam long courseId, @RequestParam String title) {
		if (courses.containsKey(courseId)) {
			Course course = courses.get(courseId);
			Discussion discussion = new Discussion(title, course);
			discussions.put(discussion.getId(), discussion);
			return "Discussion created successfully!";
		} else {
			return "Course not found!";
		}
	}

	@GetMapping("/getDiscussions")
	public List<Discussion> getDiscussions() {
		return new ArrayList<>(discussions.values());
	}

	@PostMapping("/createAssignment")
	public String createAssignment(@RequestParam long courseId, @RequestParam String title) {
		if (courses.containsKey(courseId)) {
			Course course = courses.get(courseId);
			Assignment assignment = new Assignment(title, course);
			assignments.put(assignment.getId(), assignment);
			return "Assignment created successfully!";
		} else {
			return "Course not found!";
		}
	}

	@GetMapping("/getAssignments")
	public List<Assignment> getAssignments() {
		return new ArrayList<>(assignments.values());
	}

	@PostMapping("/submitAssignment")
	public String submitAssignment(@RequestParam long enrollmentId, @RequestParam long assignmentId, @RequestParam String content) {
		if (enrollments.containsKey(enrollmentId) && assignments.containsKey(assignmentId)) {
			Enrollment enrollment = enrollments.get(enrollmentId);
			Assignment assignment = assignments.get(assignmentId);
			assignment.submitSolution(enrollment, content);
			return "Assignment submitted successfully!";
		} else {
			return "Enrollment or assignment not found!";
		}
	}

	@GetMapping("/getGrades")
	public List<Grade> getGrades() {
		List<Grade> grades = new ArrayList<>();
		for (Enrollment enrollment : enrollments.values()) {
			Grade grade = new Grade(enrollment, calculateFinalGrade(enrollment));
			grades.add(grade);
		}
		return grades;
	}

	private double calculateFinalGrade(Enrollment enrollment) {
		return 0.0;
	}

	private boolean canEnroll(Student student, Course course) {
		return true;
	}
}
















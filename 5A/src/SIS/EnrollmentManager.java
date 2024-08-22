package SIS;

public class EnrollmentManager {
	 public void enroll(Student student, Course course) {
	        student.enrollInCourse(course);
	    }

	    public void drop(Student student, Course course) {
	        student.dropCourse(course);
	    }
}

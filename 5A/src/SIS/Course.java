package SIS;

import java.util.ArrayList;
import java.util.List;

public class Course implements CourseInterface {
	private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
	@Override
	public String getCourseId() {
		// TODO Auto-generated method stub
		return courseId;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return courseName;
	}

	@Override
	public List<Student> getEnrolledStudents() {
		// TODO Auto-generated method stub
		return enrolledStudents;
	}

	@Override
	public void enrollStudent(Student student) {
		// TODO Auto-generated method stub
		if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
	}

	@Override
	public void dropStudent(Student student) {
		// TODO Auto-generated method stub
		enrolledStudents.remove(student);
	}

}

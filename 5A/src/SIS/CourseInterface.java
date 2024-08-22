package SIS;

import java.util.List;

public interface CourseInterface {
	String getCourseId();
    String getCourseName();
    List<Student> getEnrolledStudents();
    void enrollStudent(Student student);
    void dropStudent(Student student);
}

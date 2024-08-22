package SIS;

import java.util.ArrayList;
import java.util.List;

public class Student implements StudentInterface {
	private String name;
    private String id;
    private List<Course> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void enrollInCourse(Course course) {
		// TODO Auto-generated method stub
		if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
	}

	@Override
	public void dropCourse(Course course) {
		// TODO Auto-generated method stub
		if (courses.contains(course)) {
            courses.remove(course);
            course.dropStudent(this);
        }
	}

}

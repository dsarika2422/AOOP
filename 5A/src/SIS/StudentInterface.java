package SIS;

public interface StudentInterface {
	String getName();
    String getId();
    void enrollInCourse(Course course);
    void dropCourse(Course course);
}

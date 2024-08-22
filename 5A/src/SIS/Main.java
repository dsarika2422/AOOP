package SIS;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Aruna", "S001");
        Student student2 = new Student("charlie", "S002");
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Science");
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student1, course2);
        enrollmentManager.enroll(student2, course1);
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
        System.out.println("Students enrolled in " + course2.getCourseName() + ":");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
	}

}

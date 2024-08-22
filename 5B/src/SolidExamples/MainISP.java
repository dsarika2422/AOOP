package SolidExamples;

public class MainISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker robot = new Robot();
        robot.work();

        Human human = new Human();
        human.work();
        human.eat();
	}

}

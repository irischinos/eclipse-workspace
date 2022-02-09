
public class Main {
	public static void main(String[] args) {
		
		/* creando un objeto // implementando un objeto */
		/*
		Robot Juan = new Robot();
		System.out.println(Juan.ext);
		*/
		Robot robot = new Robot();
		System.out.println(robot.ext);
		// robot.caminar();
		robot.caminar();
		robot.caminar(10);
		robot.caminar("Iris");
		robot.caminar(10, 10);
		
		System.out.println(robot.ext);
		
		
		
	}
}

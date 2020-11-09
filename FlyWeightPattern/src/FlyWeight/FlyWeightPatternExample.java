/**
 * 
 */
package FlyWeight;
import java.util.Random;
/**
 * @author niranjan
 *
 */
public class FlyWeightPatternExample {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RobotFactory robotFactory = new RobotFactory();
		System.out.println("***Flyweight Pattern Example***");
		Robot robot;
		//3 small type robot
		for (int i = 0; i <3; i++) {
			robot = RobotFactory.getRobotFromFactory("small");
			Thread.sleep(1000);
			robot.showMe(getRandomColor());
		}
		
		int noOfDistinctRobots = robotFactory.totalObjectCreated();
		System.out.println("Till now, Totoal no of distinct robot object created: " + noOfDistinctRobots);
		
		//	5 Largetype robot
		for (int i = 0; i <5; i++) {
			robot = RobotFactory.getRobotFromFactory("large");
			Thread.sleep(1000);
			robot.showMe(getRandomColor());
		}
		noOfDistinctRobots = robotFactory.totalObjectCreated();
		System.out.println("Till now, Totoal no of distinct robot object created: " + noOfDistinctRobots);
		
		//4 Largetype robot
		for (int i = 0; i <4; i++) {
			robot = RobotFactory.getRobotFromFactory("fixed");
			Thread.sleep(1000);
			robot.showMe(getRandomColor());
		}
		noOfDistinctRobots = robotFactory.totalObjectCreated();
		System.out.println("Till now, Totoal no of distinct robot object created: " + noOfDistinctRobots);
		
		
	}

	/**
	 * @return
	 */
	private static String getRandomColor() {
		// TODO Auto-generated method stub
		Random r = new Random();
		int random = r.nextInt();
		if(random%3==0) {
			return "red";
		}else if(random%3==1) {
			return "green";
		}else {
			return "blue";
		}
	}

}

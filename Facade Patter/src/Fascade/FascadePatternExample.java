/**
 * 
 */
package Fascade;

/**
 * @author niranjan
 *
 */
public class FascadePatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Facade pattern Demo***");
		RobotFacade milanoRobot = new RobotFacade();
		milanoRobot.createMilanoRobot();
		RobotFacade robonautRobot = new RobotFacade();
		robonautRobot.createRobonautRobot();
		milanoRobot.destroyMilanoRobot();
		robonautRobot.destroyRobonautRobot();
	}

}

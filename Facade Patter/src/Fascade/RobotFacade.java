/**
 * 
 */
package Fascade;

/**
 * @author niranjan
 *
 */
public class RobotFacade {
	RobotColor robotColor;
	RobotHands robotHands;
	RobotBody robotBody;
	public RobotFacade() {
		robotColor = new RobotColor();
		robotHands = new RobotHands();
		robotBody = new RobotBody();
	}
	
	public void createMilanoRobot() {
		RobotBody.createBody();
		System.out.println("Creation of a Milano Robot Start");
		robotColor.setDefaultColor();
		robotHands.setMilanoHands();
		robotBody.createHands();
		robotBody.createRemainingParts();
		System.out.println("Milano Robot Creation End");
		System.out.println("");
	}
	public void createRobonautRobot() {
		RobotBody.createBody();
		System.out.println("Creation of a Robonaut Robot Start");
		robotColor.setGreenColor();
		robotHands.setRobonoutHands();
		robotBody.createHands();
		robotBody.createRemainingParts();
		System.out.println("Robonaut Robot Creation End");
		System.out.println("");
	}
	public void destroyMilanoRobot() {
		RobotBody.destroyBody();
		System.out.println("Milano Robot's destruction process is started");
		robotHands.resetMilanoHands();
		robotBody.destroyHands();
		robotBody.destroyRemainingParts();
		System.out.println("Milano Robot's destruction process is over");
		System.out.println("");
	}
	public void destroyRobonautRobot() {
		RobotBody.destroyBody();
		System.out.println("Robonaut Robot's destruction process is started");
		robotHands.resetRobonoutHands();
		robotBody.destroyHands();
		robotBody.destroyRemainingParts();
		System.out.println("Robonaut Robot's destruction process is over");
		System.out.println("");
	}
}

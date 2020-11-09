/**
 * 
 */
package FlyWeight;

import java.util.Map;
import java.util.HashMap;
/**
 * @author niranjan
 *
 */
public class RobotFactory {
	static Map<String, Robot> robotFactory = new HashMap<String, Robot>();
	
	public int totalObjectCreated() {
		return robotFactory.size();
	}
	
	public static synchronized Robot getRobotFromFactory(String robotType) throws Exception{
		Robot robotCategory = robotFactory.get(robotType);
		if (robotCategory==null) {
			switch (robotType) {
			case "small":
				System.out.println("We do not have Small Robot. so we are creating a small robot now. ");
				robotCategory = new SmallRobot();
				break;
			case "large":
				System.out.println("We do not have Large Robot at Present. So we are creating a large robot now.");
				robotCategory = new LargeRobot();
				break;
			case "fixed":
				System.out.println("We do not have fixed size at present. So, we are creating a fixed size robot now");
				robotCategory = new FixedRobot();
				break;
			default:
				throw new Exception("Robot Factory can create only small, rage or fixed size robot");
			}
			robotFactory.put(robotType,robotCategory);
		}else {
			System.out.println("\n \t Using Existing" + robotType + "Robot and Coloring it");
		}
		return robotCategory;
	}
}

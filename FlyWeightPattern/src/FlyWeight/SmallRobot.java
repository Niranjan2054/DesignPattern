/**
 * 
 */
package FlyWeight;

/**
 * @author niranjan
 *
 */
public class SmallRobot implements Robot {
	private final String robotTypeCreated;
	/**
	 * 
	 */
	public SmallRobot() {
		// TODO Auto-generated constructor stub
		robotTypeCreated = "A Small Robot Created";
		System.out.println(robotTypeCreated);
	}

	@Override
	public void showMe(String color) {
		// TODO Auto-generated method stub
		System.out.println(" with " + color + " Color ");
	}

}

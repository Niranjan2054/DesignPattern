/**
 * 
 */
package FlyWeight;

/**
 * @author niranjan
 *
 */
public class FixedRobot implements Robot{
	private final String robotTypeCreated;
	
	/**
	 * 
	 */
	public FixedRobot() {
		// TODO Auto-generated constructor stub
		robotTypeCreated = " A Robot with Fixed size created";
		System.out.println(robotTypeCreated);
	}
	@Override
	public void showMe(String color) {
		// TODO Auto-generated method stub
		System.out.println(" with " + " blue (default) Color ");
	}

}

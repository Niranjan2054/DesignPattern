/**
 * 
 */
package FlyWeight;

/**
 * @author niranjan
 *
 */
public class LargeRobot implements Robot{
	private final String robotTypeCreate;
	
	/**
	 * 
	 */
	public LargeRobot() {
		// TODO Auto-generated constructor stub
		robotTypeCreate = "A Large Robot Created";
		System.out.println(robotTypeCreate);
	}

	@Override
	public void showMe(String color) {
		// TODO Auto-generated method stub
		System.out.println(" with " + color + " Color ");
		
	}

}

/**
 * 
 */
package bridge;

/**
 * @author niranjan
 *
 */
public class OnState implements State{

	@Override
	public void moveState() {
		// TODO Auto-generated method stub
		System.out.println("On State\n");
		
	}

	@Override
	public void hardPressed() {
		// TODO Auto-generated method stub
		System.out.println("\n The device is already on. Do not press the button so hard.\n");
	}

}

/**
 * 
 */
package bridge;

/**
 * @author niranjan
 *
 */
public class OffState implements State{

	@Override
	public void moveState() {
		// TODO Auto-generated method stub
		System.out.println("Off State");
		
	}

	@Override
	public void hardPressed() {
		// TODO Auto-generated method stub
		System.out.println("\n The device is Offline now. Do not press the off button again.\n");
	}

}

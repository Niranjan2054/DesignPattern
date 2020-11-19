/**
 * 
 */
package bridge;

/**
 * @author niranjan
 *
 */
public class BridgePatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Bridge Pattern Demo***");
		System.out.println("\n Dealing with a Television at Present.");
		
		State presentState = new OnState();
		
		ElectronicGoods eItem = new Television();
		
		eItem.setState(presentState);
		eItem.moveToCurrentState();
		
		eItem.hardButtonPressed();
		
		presentState = new OffState();
		eItem.setState(presentState);
		eItem.moveToCurrentState();
		
		
		System.out.println("\n Dealing with a DVD now.");
		
		presentState = new OnState();
		
		eItem = new DVD();
		
		eItem.setState(presentState);
		eItem.moveToCurrentState();
		
		eItem.hardButtonPressed();
		
		presentState = new OffState();
		eItem.setState(presentState);
		eItem.moveToCurrentState();
		
	}

}

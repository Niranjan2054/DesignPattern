/**
 * 
 */
package Decorator;

/**
 * @author niranjan
 *
 */
public class FloorDecorator extends AbstractDecorator{
	public void makeHouse() {
		super.makeHouse();
		System.out.println("***Floor Decoration is in Action***");
		addFloor();
	}
	private void addFloor() {
		System.out.println("I am making an additional floor on top of it.");
	}
}

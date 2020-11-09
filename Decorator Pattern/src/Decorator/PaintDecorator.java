/**
 * 
 */
package Decorator;

/**
 * @author niranjan
 *
 */
public class PaintDecorator extends AbstractDecorator{
	public void makeHouse() {
		super.makeHouse();
		System.out.println("***Paint Decortor is in Action now***");
		paintTheHouse();
	}
	private void paintTheHouse() {
		System.out.println("Now I am painting the house.");
	}
}

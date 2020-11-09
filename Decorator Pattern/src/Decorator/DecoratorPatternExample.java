/**
 * 
 */
package Decorator;

import java.awt.Paint;

/**
 * @author niranjan
 *
 */
public class DecoratorPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Decorator Pattern Example***");
		ConcreteComponent withoutDecorator = new ConcreteComponent();
		withoutDecorator.makeHouse();
		
		System.out.println("_________________________________________________________\n");
		
		System.out.println("Using a Floor Decorator now");
		
		FloorDecorator floorDecorator = new FloorDecorator();
		floorDecorator.setTheComponent(withoutDecorator);
		floorDecorator.makeHouse();
		
		System.out.println("_________________________________________________________\n");
		System.out.println("Using a Paint Decorator now");
		PaintDecorator paintDecorator = new PaintDecorator();
		paintDecorator.setTheComponent(floorDecorator);
		paintDecorator.makeHouse();
		System.out.println("__________________________________________________________");
	}

}

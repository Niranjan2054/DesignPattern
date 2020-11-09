/**
 * 
 */
package Adapter;

/**
 * @author niranjan
 *
 */
public class CalculatorAdapter {
	public double getArea(Triangle t) {
		Calculator c = new Calculator();
		Rectangle rect = new Rectangle();
		rect.length = t.base;
		rect.width = t.height * 0.5;
		return c.getArea(rect);
	}
}

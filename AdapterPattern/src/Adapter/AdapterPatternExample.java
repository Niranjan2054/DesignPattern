package Adapter;
/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class AdapterPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Adapter Pattern Demo***");
		CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
		Triangle t = new Triangle(20,10);
		System.out.println("Area of Triangle is " + calculatorAdapter.getArea(t) + " Square Unit");
	}

}

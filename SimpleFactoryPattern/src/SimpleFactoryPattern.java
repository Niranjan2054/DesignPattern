/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class SimpleFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Simple Factory Pattern Demo***");
		
		Animal animal;
		
		SimpleFactory simpleFactory = new SimpleFactory();
		animal = simpleFactory.createAnimal();
		animal.speak();
		animal.preferedAction();
	}

}

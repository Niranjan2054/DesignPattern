/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class AbstractMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Factory Pattern Demo***");
		
		AnimalFactory tigerFactory = new TigerFactory();
		
		Animal aTiger = tigerFactory.createAnimal();
		aTiger.speak();
		aTiger.Action();
		
		AnimalFactory dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		
		dog.speak();
		dog.Action();
	}

}

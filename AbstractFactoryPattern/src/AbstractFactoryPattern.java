/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class AbstractFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalFactory animalFactory;
		Dog dog;
		Tiger tiger;
		
		System.out.println("***Abstract Factory Pattern Demo***\n");
		
		//Making a wild dog through WildAnimal Factory
		System.out.println("Making a wild dog through WildAnimal Factory\n");
		
		animalFactory = new WildAnimalFactory();
		dog = animalFactory.createDog();
		
		dog.speak();
		dog.preferredAction();
		
		//Making a wild tiger through wild animal factory
		System.out.println("Making a wild tiger through wild animal factory\n");
		tiger = animalFactory.createTiger();
		tiger.speak();
		tiger.preferredAction();
		
		System.out.println("************************");
		
		
		//Making a Pet Dog thorugh Pet Animal factory
		System.out.println("Making a Pet Dog thorugh Pet Animal factory\n");
		animalFactory = new PetAnimalFactory();
		
		dog = animalFactory.createDog();
		dog.speak();
		dog.preferredAction();
		
		
		//Making a pet Tiger though PetAnimal Factory
		System.out.println("Making a pet Tiger though PetAnimal Factory\n");
		tiger = animalFactory.createTiger();
		tiger.speak();
		tiger.preferredAction();
	}

}

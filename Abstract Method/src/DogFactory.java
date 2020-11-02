/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class DogFactory extends AnimalFactory{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}
	
}

/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class PetAnimalFactory implements AnimalFactory{

	@Override
	public Dog createDog() {
		// TODO Auto-generated method stub
		return new PetDog();
	}

	@Override
	public Tiger createTiger() {
		// TODO Auto-generated method stub
		return new PetTiger();
	}

}

/**
 * 
 */

/**
 * @author niranjan
 *
 */
public class WildAnimalFactory implements AnimalFactory{

	@Override
	public Dog createDog() {
		// TODO Auto-generated method stub
		return new WildDog();
	}

	@Override
	public Tiger createTiger() {
		// TODO Auto-generated method stub
		return new WildTiger();
	}

}

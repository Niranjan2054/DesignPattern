/**
 * 
 */
package BuilderPattern;

/**
 * @author niranjan
 *
 */
public class MotorCycle implements Builder {
	private String brandName;
	private Product product;
	public MotorCycle(String brand) {
		product = new Product();
		this.brandName = brand;
	}
	@Override
	public void startUpOperation() {
		// TODO Auto-generated method stub
//		Nothing in this case
		
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		product.add("This is a body of a MotorCycle");
	}

	@Override
	public void insertWheels() {
		// TODO Auto-generated method stub
		product.add("2 wheels are added");
	}

	@Override
	public void addHeadlights() {
		// TODO Auto-generated method stub
		product.add("1 Headlights are added");
	}

	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
		product.add(String.format("Motorcycle model is %s",this.brandName ));
	}

	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return this.product;
	}
	
}

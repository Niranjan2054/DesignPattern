/**
 * 
 */
package BuilderPattern;

/**
 * @author niranjan
 *
 */
public class Car implements Builder{
	private String brandName;
	private Product product;
	public Car(String brand) {
		product = new Product();
		this.brandName = brand;
	}
	@Override
	public void startUpOperation() {
		// TODO Auto-generated method stub
		product.add(String.format("Car model is: %s", this.brandName));
		
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		product.add("This is a body of a Car");
		
	}
	@Override
	public void insertWheels() {
		// TODO Auto-generated method stub
		product.add("4 wheels are added");
		
	}
	@Override
	public void addHeadlights() {
		// TODO Auto-generated method stub
		product.add("2 Headlights are added");
	}
	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
//		Noting in this case
	}
	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return this.product;
	}
}

package prototype;

public class Ford extends BasicCar{
	public int basePrice = 200000;
	public Ford(String m) {
		// TODO Auto-generated constructor stub
		modelName  = m;
	}
	@Override
	public BasicCar clone() throws CloneNotSupportedException{
		return (Ford)super.clone();
	}

}

package prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable{
	public String modelName;
	public int basePrice;
	public int onRoadPrice;
	public BasicCar() {
		// TODO Auto-generated constructor stub
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public static int setAdditionalPrice() {
		Random r = new Random();
		return r.nextInt(10000);
	}
	public BasicCar clone() throws CloneNotSupportedException{
		return (BasicCar)super.clone();
	}
}

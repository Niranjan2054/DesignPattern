/**
 * 
 */
package BuilderPattern;

/**
 * @author niranjan
 *
 */
public interface Builder {
	void startUpOperation();
	void buildBody();
	void insertWheels();
	void addHeadlights();
	void endOperations();
	//This method is used to retrieve the object that is constructed.
	Product getVehicle();
	
}

/**
 * 
 */
package BuilderPattern;

/**
 * @author niranjan
 *
 */
public class Director {
	Builder builder;
	public void construct(Builder builder) {
		this.builder = builder;
		builder.startUpOperation();
		builder.buildBody();
		builder.insertWheels();
		builder.addHeadlights();
		builder.endOperations();
	}
	
}

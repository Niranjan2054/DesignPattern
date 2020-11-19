/**
 * 
 */
package composite;

/**
 * @author niranjan
 *
 */
public class SimpleEmployee implements Employee{
	private String name;
	private String dept;
	private int employeeCount =0;
	/**
	 * 
	 */
	public SimpleEmployee(String name, String dept) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.dept = dept;
	}
	@Override
	public void printStructures() {
		// TODO Auto-generated method stub
		System.out.println("\t\t"+this.name + " works in " + this.dept);
		
	}
	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		return employeeCount;
	}
}

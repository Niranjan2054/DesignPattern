/**
 * 
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjan
 *
 */
public class CompositeEmployee implements Employee{
	private int employeeCount = 0;
	private String name;
	private String dept;
	private List<Employee> controls;
	
	/**
	 * 
	 */
	public CompositeEmployee(String name, String dept) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.dept = dept;
		this.controls = new ArrayList<Employee>();
	}
	public void addEmployee(Employee e) {
		this.controls.add(e);
	}
	public void remoteEmployee(Employee e) {
		this.controls.remove(e);
	}
	
	@Override
	public void printStructures() {
		// TODO Auto-generated method stub
		System.out.println("\t" + this.name + " works in " + this.dept);
		for(Employee e: controls) {
			e.printStructures();
		}
		
	}

	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		employeeCount = controls.size();
		for(Employee e: controls) {
			employeeCount+=e.getEmployeeCount();
		}
		return employeeCount;
	}

}

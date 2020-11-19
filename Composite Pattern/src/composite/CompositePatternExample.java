/**
 * 
 */
package composite;

/**
 * @author niranjan
 *
 */
public class CompositePatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Composite Pattern Demo***");
		SimpleEmployee mathTeacher1 = new SimpleEmployee("Math Teacher-1","Maths");
		SimpleEmployee mathTeacher2 = new SimpleEmployee("Math Teacher-2","Maths");
		
		SimpleEmployee cseTeacher1  = new SimpleEmployee("CSE  Teacher-1","Computer SC.");
		SimpleEmployee cseTeacher2  = new SimpleEmployee("CSE  Teacher-2","Computer SC.");
		SimpleEmployee cseTeacher3  = new SimpleEmployee("CSE  Teacher-3","Computer SC.");

		CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD-Maths)","Maths");		
		CompositeEmployee hodCompSc = new CompositeEmployee("Mr. V. Sarcar(HOD-CSE)","Computer Sc.");		
		
		CompositeEmployee principal = new CompositeEmployee("Mr. S. Som(Principal)","Planning-Supervising-Managing");		

		hodMaths.addEmployee(mathTeacher1);
		hodMaths.addEmployee(mathTeacher2);
		
		hodCompSc.addEmployee(cseTeacher1);
		hodCompSc.addEmployee(cseTeacher2);
		hodCompSc.addEmployee(cseTeacher3);
		
		principal.addEmployee(hodMaths);
		principal.addEmployee(hodCompSc);
		
		System.out.println("\nTesting the structure of a Principal Object");
		principal.printStructures();
		System.out.println("At present Principal has control over " + principal.getEmployeeCount() + " number of employees");

		System.out.println("\n---------------------------------------------");
		System.out.println("Testing the structure of a HOD-CSE object");
		hodCompSc.printStructures();
		System.out.println("At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees");

		System.out.println("\n---------------------------------------------");
		System.out.println("Testing the structure of a HOD-Maths object");
		hodMaths.printStructures();
		System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees");
		
		//For Leaf Node
		System.out.println("\n Testing the structure of a leaf node:");
		mathTeacher1.printStructures();
		System.out.println("At present Math Teacher-1 has control over " + mathTeacher1.getEmployeeCount() + " number of employees.");
		
		//suppose one computer teacher is leaving now
		hodCompSc.remoteEmployee(cseTeacher2);
		System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");
		principal.printStructures();
		
		System.out.println("At present principal has control over " + principal.getEmployeeCount() + " number of employees");
		System.out.println("At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees");		System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees");
		System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees");

	}

}

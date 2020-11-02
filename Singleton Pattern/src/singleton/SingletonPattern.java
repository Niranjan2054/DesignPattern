package singleton;
public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Singleton Pattern Demo");
		System.out.println("Trying to make a captain for your team");
		
//		Captain c3 = new Captain();	
		Captain captain1 = Captain.getCaptain();
		System.out.println("Trying to make anothe Captain for your team:");
		Captain captain2 = Captain.getCaptain();
		if (captain1==captain2) {
			System.out.println("Captain 1 and Captain 2 are same instances");
		}
	}
	

}

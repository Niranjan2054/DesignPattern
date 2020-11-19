/**
 * 
 */
package Proxy;

/**
 * @author niranjan
 *
 */
public class Proxy extends Subject{
	static Subject cs;
	@Override
	public void doSomeWork() {
		// TODO Auto-generated method stub
		System.out.println("Proxy call happening now...");
		if(cs==null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}

}

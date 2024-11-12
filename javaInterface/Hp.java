package javaInterface;

public class Hp implements Laptop {

	@Override
	public void lock() {
		System.out.println("Hp lock");
		
	}

	@Override
	public void webCam() {
		System.out.println("Hp web Cam");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Hp Power Off");
		
	}

	@Override
	public void powerOn() {
		System.out.println("Hp Power On");
		
	}
	
	public void extendedMemory() {
		System.out.println("Hp Extended Memory");
		
	}
	
//	@Override
	static void pattern() {
		System.out.println("Hp Pattern");
	}


}

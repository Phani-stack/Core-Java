package javaInterface;

public class Main {

	public static void main(String[] args) {
		
		Hp hp = new Hp();
		Apple app = new Apple();
		
		hp.extendedMemory();
		hp.lock();
		hp.powerOn();
		hp.powerOn();
		hp.webCam();
		// hp.pattern(); no error
		
		System.out.println();
	
		app.light();
		app.security();
		app.light();
		app.lock();
		
		System.out.println();
		
		Laptop.pattern();
		
	}

}

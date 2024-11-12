package javaInterface;

public interface Laptop {
	
	public void lock();
	public void webCam();
	public void powerOff();
	public void powerOn();
	
	default void security() {
		System.out.println("Security");
		fLock();
	}
	
	static void pattern() {
		System.out.println("Laptop Pattern");
		fLock();
	}
	
	private static void fLock() {
		System.out.println("Face Lock");
	}
	
}

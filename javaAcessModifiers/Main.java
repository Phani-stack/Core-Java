package javaAcessModifiers;

public class Main {

	public static void main(String[] args) {
		Main modifier = new Main();
		
		modifier.Mpublic();
		modifier.Mprivate();
		modifier.Mdefault();
		modifier.Mprotected();
	}
	
	private void Mprivate() {
		
		System.out.println("Private");
	}
	
	void Mdefault() {
		
		System.out.println("Default");
//		fun3();
	}
	
	public void Mpublic() {
	
		System.out.println("Public");

	}
	
	protected void Mprotected() {
		System.out.println("Protected");
	}
}

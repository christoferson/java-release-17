package demo;

public class TryJava17StrictFp {

	public static void main(String[] args) {
		StrictFpEx1 ex1 = new StrictFpEx1();
		
		StrictFpEx2 ex2 = null;
		
		StrictFpEx3 ex3 = new StrictFpEx3(); ex3.foo();
		
		StrictFpEx4 ex4 = new StrictFpEx4(); ex4.foo();

	}
	
	static strictfp public class StrictFpEx1 { // strictfp applies to all methods in this class
	}
	
	strictfp interface StrictFpEx2 {// strictfp applies to all methods in this interface
	}
	
	static class StrictFpEx3 {
		strictfp void foo() {// strictfp applies to method foo only
			var dec = 187.56 / 12.5;
			System.out.println(dec);
		}
	}
	
	static strictfp class StrictFpEx4 {// strictfp applies to all methods in this class
		strictfp void foo() {// strictfp declaration redundant, but still valid
			var dec = 187.56 / 12.5;
			System.out.println(dec);			
		}
	}
	
	// Illegal modifier for the field f; only public, protected, private, static, final, transient & volatile are permitted
	static class StrictFpEx5NG {
		strictfp float f; // Illegal modifier for the field f; only public, protected, private, static, final, transient & volatile are permitted
	}


}

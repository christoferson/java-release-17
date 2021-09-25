package demo;

public class TryJava17StrictFp {

	public static void main(String[] args) {
		StrictFpEx1 ex1 = new StrictFpEx1();
		
		StrictFpEx2 ex2 = null;
		
		StrictFpEx3 ex3 = new StrictFpEx3();

	}
	
	static strictfp public class StrictFpEx1 { // strictfp applies to all methods in this class
	}
	
	strictfp interface StrictFpEx2 {// strictfp applies to all methods in this interface
	}
	
	static class StrictFpEx3 {
		strictfp void foo() {// strictfp applies to method foo only
		}
	}


}

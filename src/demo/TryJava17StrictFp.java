package demo;

public class TryJava17StrictFp {

	public static void main(String[] args) {
		StrictFpEx1 ex1 = new StrictFpEx1();
		
		StrictFpEx2 ex2 = null;

	}
	
	static strictfp public class StrictFpEx1 { // strictfp applies to all methods in this class
	}
	
	strictfp interface StrictFpEx2 {// strictfp applies to all methods in this interface
	}

}

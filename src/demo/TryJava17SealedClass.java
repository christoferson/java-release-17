package demo;

public class TryJava17SealedClass {

	public static void main(String[] args) {

	}
	
	sealed class StrictFpEx9Y permits StrictFpEx9X {
	}
	 
	non-sealed class StrictFpEx9X extends StrictFpEx9Y {
	}


}

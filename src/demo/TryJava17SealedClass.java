package demo;

public class TryJava17SealedClass {

	public static void main(String[] args) {

	}

	// Ex1
	
	sealed class SealedClassEx1Y permits SealedClassEx1X {
	}
	 
	non-sealed class SealedClassEx1X extends SealedClassEx1Y {
	}

	// Ex2
	
	sealed interface SealedClassEx2I extends SealedClassEx2SI {
	}
	 
	non-sealed class SealedClassEx2X implements SealedClassEx2SI {
	}
	 
	sealed interface SealedClassEx2SI permits SealedClassEx2X, SealedClassEx2I {
	}
	 
	non-sealed interface SealedClassEx2I2 extends SealedClassEx2I {
	}

	// Ex3

}

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
	
	// Ex 3
	
	sealed class SealedClassEx3X permits SealedClassEx3Y {
	}
	 
	non-sealed class SealedClassEx3Y extends SealedClassEx3X {
	}

	// Ex4
	
	sealed public class SealedClassEx4X<T> {
	}
	 
	non-sealed class SealedClassEx4Y extends SealedClassEx4X<Integer> {
	}
	
	// Ex5
	
	// - Duplicate modifier for the type SealedClassEx5NG
	// - Sealed class or interface lacks the permits clause and no class or interface from the same compilation unit declares SealedClassEx5NG as its direct superclass or superinterface
//	sealed public sealed class SealedClassEx5NG {
//	}
	

}

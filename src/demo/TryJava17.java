package demo;

public class TryJava17 {

	public static void main(String[] args) {
		PatternMatchingSwitchEx1("bar");
	}

	private static void PatternMatchingSwitchEx1(Object o) {
		System.out.println("Try Pattern Matching Switch Ex1");
		switch (o) {
			case Integer i -> System.out.println("Received Integer!");
			case String s  -> System.out.println("Received String!");
			default		   -> System.out.println("Received Object!");
		}
	}

}

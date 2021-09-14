package demo;

public class TryJava17 {

	public static void main(String[] args) {
		PatternMatchingSwitchEx1("bar");
		PatternMatchingSwitchEx2("longstring");
		PatternMatchingSwitchEx2("str");
		PatternMatchingSwitchEx2(new Object());
	}

	private static void PatternMatchingSwitchEx1(Object o) {
		System.out.println("Try Pattern Matching Switch Ex1");
		switch (o) {
			case Integer i -> System.out.println("Received Integer!");
			case String s  -> System.out.println("Received String!");
			default		   -> System.out.println("Received Object!");
		}
	}
	
	private static void PatternMatchingSwitchEx2(Object o) {
	   switch (o) {
	     case Integer i: System.out.println("Integer: " + i); break;
	     case String s && s.length() > 5: System.out.println("String > 5: " + s); break;
	     case String s: System.out.println("String: " + s); break;
	     case TryJava17 t: System.out.println("TryJava17: " + t); break;
	     default : System.out.println("Object: " + o);
	   }
	}

}

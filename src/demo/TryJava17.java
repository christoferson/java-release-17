package demo;

public class TryJava17 {

	public static void main(String[] args) {
		System.out.println("Try Pattern Matching Switch Ex1");
		PatternMatchingSwitchEx1("bar");
		System.out.println("Try Pattern Matching Switch Ex2");
		PatternMatchingSwitchEx2("longstring");
		PatternMatchingSwitchEx2("str");
		PatternMatchingSwitchEx2(new Object());
		System.out.println("Try Pattern Matching Switch Ex3");
		PatternMatchingSwitchEx3("longstring");
		PatternMatchingSwitchEx3("str");
		PatternMatchingSwitchEx3(new Object());
		System.out.println("Try Pattern Matching Switch Ex4");
		PatternMatchingSwitchEx4(Integer.valueOf(12));
		PatternMatchingSwitchEx4(Integer.valueOf(7));
		
		System.out.println("Try Pattern Matching Switch Ex5");
		try { PatternMatchingSwitchEx5("str"); } catch (Exception e) { System.out.println("Got Exception!"); } 
		System.out.println("Try Pattern Matching Switch Ex6");
		PatternMatchingSwitchEx6("str");
	}

	private static void PatternMatchingSwitchEx1(Object o) {
		switch (o) {
			case Integer i -> System.out.println("Received Integer! " + i);
			case String s  -> System.out.println("Received String! " + s);
			default		   -> System.out.println("Received Object! " + o);
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
	
	private static void PatternMatchingSwitchEx3(Object o) {
		switch (o) {
	     case Integer I: 
	       System.out.println("Integer"); 
	       System.out.println(I); 
	       break; 
	     case String s && s.length() > 5: 
	       System.out.println("String s && s.length() > 5"); 
	       System.out.println(s); 
	       break;
	     case String s: 
	       System.out.println("String"); 
	       System.out.println(s);
	       break; 
	     case TryJava17 t:
	       System.out.println("TryJava17"); 
	       System.out.println(t);
	       break;
	     default : System.out.println("Object"); 
	   }
	}
		
	private static void PatternMatchingSwitchEx4(Object o) {
	   switch (o) {
		   case Integer i && i > 10:
		     System.out.println("Input Value Greater than 10: " + o);
		     break;
		   case Integer j && j > 5:
		     System.out.println("Input Value Greater than 5: " + o);
		     break;
		   default:
		     System.out.println("Object: " + o);
	   }
	}
	
	private static void PatternMatchingSwitchEx5(Object o) throws Exception {
		switch (o) {
		case String s1:
			throw new Exception(s1);
		default:
			break;
		}
	}
	
	private static void PatternMatchingSwitchEx6(Object o) {
		switch (o.hashCode()) {
		case default:
			System.out.println("Default");
		}
	}
}

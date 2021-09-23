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
		
		System.out.println("Try Pattern Matching Switch Ex11");
		PatternMatchingSwitchEx11("str8237");
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
	
	// var is not allowed here
//	private static void PatternMatchingSwitchEx7(Object o) {
//		switch (o.hashCode()) {
//	     case var s : System.out.println("Error should be ANY_PATTERN");
//	     default : System.out.println("Object");
//	   }
//	}
	
	// Type mismatch: cannot convert from int to Object
//	private static void PatternMatchingSwitchEx8NG(Object o) {
//		switch (o) {
//		case 1: // Type mismatch: cannot convert from int to Object
//			System.out.println("Integer");
//			break;
//		default:
//			System.out.println("Object");
//		}
//	}
	
	//Illegal fall-through to a pattern
//	private static void PatternMatchingSwitchEx9NG(Object o) {
//	   switch (o) {
//	     case Integer I: 
//	       System.out.println("Integer"); 
//	       System.out.println(I); 
//	     case String s && s.length()>1: //Illegal fall-through to a pattern
//	       System.out.println("String s && s.length()>1"); 
//	       System.out.println(s); 
//	       break;
//	     case TryJava17 x:
//	       System.out.println("TryJava17"); 
//	       System.out.println(x);
//	       break;
//	     default : System.out.println("Object"); 
//	   }
//	}
	
	// cannot convert from null to int
//	private static void PatternMatchingSwitchEx10NG(int o) {
//	   switch (o) {
//	     case 10: 
//	       System.out.println("Integer"); 
//	       System.out.println(o); 
//	       break; 
//	     case null: // Type mismatch: cannot convert from null to int
//	       System.out.println("NULL"); 
//	       break;
//	     default : System.out.println(o); 
//	   }
//	}
	
	// Local variable len referenced from a guard must be final or effectively final
//	public static void PatternMatchingSwitchEx11NG(Object o) {
//		int len = 2;
//		switch (o) {
//			case String o1 && o1.length() > len: // Local variable len referenced from a guard must be final or effectively final
//				len = 0;
//			break;
//			default:
//				break;
//		}
//	}
	
	public static void PatternMatchingSwitchEx11(Object o) {
		final int len = 2;
		switch (o) {
			case String o1 && o1.length() > len:
				System.out.println("Len: " + len);
			break;
			default:
				break;
		}
	}
	
	// Type mismatch: cannot convert from null to int
//	private static void PatternMatchingSwitchEx12NG(int o) {
//		switch (o) {
//			case 20 -> System.out.println("20");
//			case null -> System.out.println("null"); // Type mismatch: cannot convert from null to int
//		}
//	}
	
	// This case label is dominated by one of the preceding case label
//	private static void PatternMatchingSwitchEx13NG(Integer o) {
//	   switch (o) {
//	     case  Integer i, 30  -> System.out.println(o); // This case label is dominated by one of the preceding case label
//	   }
//	}
	
}

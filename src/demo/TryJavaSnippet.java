package demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryJavaSnippet {

	public static void main(String[] args) {
		
		code1();
		
		code2();

	}

	// This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipelineg
	private static void code2() {
		Stream.of("one", "two", "three", "four", "five", "six")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
	}

	private static void code1() {
		Stream<Integer> numStream = Stream.of(10, 20, 30);
		numStream.map(n -> n + 10).peek(s -> System.out.print(s));
		//numStream.forEach(s -> System.out.println(s)); // java.lang.IllegalStateException: stream has already been operated upon or closed
		
		//In cases where the stream implementation is able to optimize away the 
		//production of some or all the elements (such as with short-circuiting operations like findFirst, or in the example described in count),
		//the action will not be invoked for those elements.

	}

}

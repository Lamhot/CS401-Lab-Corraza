package lesson9.exercise_4;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	//Use the reduce method to produce a single space-separated String
	public static void main(String[] args) {
		System.out.println(Stream.of("A", "good", "day", "to", "write", "some", "Java")
				.reduce("", (s,t)-> s + t +" "));
		
		//Optional <String>  result = strings.reduce( y -> c);
		//Optional <String>  result  = strings.reduce("", String::concat);
		//.out.println(x);
		
		
	}

	
}

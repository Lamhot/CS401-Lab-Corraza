package FinalExcercise;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> x = Stream.of("Lamhot","Bola");
		Stream<String> y = Stream.of("jago", "Baik");
		
		Stream.concat(x, y).forEach(System.out::println);

	}

}

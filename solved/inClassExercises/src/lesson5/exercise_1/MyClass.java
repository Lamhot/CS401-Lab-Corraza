package lesson5.exercise_1;

import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Joe", "Bill", "Tom");
		List<String> unList = Collections.unmodifiableList(list);
	}
}


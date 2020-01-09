package lesson11.exercise_4;
import java.util.*;



public class Reverse {
	//Fix this code using a helper method to capture the wildcard
	public static void reverse(List<?> list) {   
		reverseHelper(list);
	}

	public static <T> void reverseHelper(List<T> list) {
		List<T> tmp = new ArrayList<T>(list);   
		for (int i = 0; i < list.size(); i++) { 
	     list.set(i, tmp.get(list.size() - i - 1)); //compiler error
	   } 
	}
	
	//Test your code with this main method
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Joe"), new Person("Jim"), 
				new Person("Tom"), new Person("Anne"));
		System.out.println("Before reversing: " + persons);
		Reverse.reverse(persons);
		System.out.println("After reversing: " + persons);
		
	}

}

package lesson11.exercise_2;

import java.util.List;
import java.util.stream.Stream;

public class CountStringOccurrences {
	public static <T> int countOccurrences(List<T> arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr) {
				if (item == null) {
					count++;
				}
			}
		} else {
			for (T item : arr) {
				if (target.equals(item)) {
					count++;
				}
			}
		}
		return count;
	}
//		return (int) Stream.of(arr).filter(x->
//		{
//			if(targer==null) reurn (x==null)})
//		}
	
	
}

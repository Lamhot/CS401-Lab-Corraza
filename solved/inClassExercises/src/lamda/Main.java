package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Justin", "Monica", "Irene", "caterpillar");
		System.out.println(names);
		// names.replaceAll(String::toUpperCase);

		Collections.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		Collections.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return StringOrder.byLength(s1, s2);
			}
		});

		Collections.sort(names, (s1, s2) -> StringOrder.byLength(s1, s2));

		Collections.sort(names, StringOrder::byLength);

		Collections.sort(names, StringOrder::byLexicography);

		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

		Collections.sort(names, String::compareTo);

		Collections.sort(names, StringOrder::byLexicographyIgnoreCase);

		System.out.println(names);

		System.out.println(transformStrings(names, String::toUpperCase));

		System.out.println(names);

	}

	private static List<String> transformStrings(List<String> names, Function<String, String> fx) {
		List<String> appliedNames = new ArrayList<>();
		for (String n : names) {
			appliedNames.add(fx.apply(n));
		}
		return appliedNames;
	}

}

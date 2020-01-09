package enum_test;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEnumComparator c = new MyEnumComparator();
		int order = c.compare(MyEnum.CAT, MyEnum.DOG);
		
		NavigableSet<MyEnum> set = new TreeSet<MyEnum>(c);
		MyEnum[] array = MyEnum.values();
		Arrays.sort(array, c);    
		System.out.println(array.toString());

	}

}

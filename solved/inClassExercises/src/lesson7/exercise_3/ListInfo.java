package lesson7.exercise_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();

	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
	}

	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");

		// use java8 foreach to copy all list elements into strList

//		for (String str : list) {
//			strList.add(str);
//
//		}
//		
		
		
		
		MyConsumer x = new MyConsumer();;
		
		//list.forEach(item->strList.add((item)));
		
		list.forEach(strList->x.accept(strList));
		System.out.println(strList);
	}
	
	public class MyConsumer implements Consumer<String> {

		@Override
		public void accept(String t) {
		
			strList.add(t);
			
		}

	}
}

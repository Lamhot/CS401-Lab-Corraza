package MPP_Final_Exams.Problem2.Exam;

import MPP_Final_Exams.helperclasses.Book;
import MPP_Final_Exams.helperclasses.LibraryMember;
import MPP_Final_Exams.helperclasses.TestData;

import java.util.Iterator;
import java.util.List;
public class Problem2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem2 p = new Problem2();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();
		
		
	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		return null;
		//fix this
//		return mems.stream().filter(mem -> 
//		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
//		          .getCheckoutRecordEntries().size() == 10)
//		    .findFirst().orElse(null);
		
		
	}
}
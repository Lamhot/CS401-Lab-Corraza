package lesson10.exercise_1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
	@Test
	public void testLambda() {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(2, new Customer("12", "Lamhot","Siagian")));
		accounts.add(new Account(60, new Customer("44", "Lamhot","Siagian")));
		System.out.println(Problem1.specialAccounts(accounts));
		assertEquals(accounts.size(), 2);
	}
}

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import java.util.*;
/**
 * this class has the main method that runs the program
 * @author Javier Garcia
 *
 */
public class SortingMain {
	public static void main(String args[]) {
		int amount = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many inputs do you want in the array?");
		amount = kb.nextInt();
		SortingHelper list = new SortingHelper(amount);
		String inputs[] = new String[amount];

		for (int i = 0; i <= amount - 1; i++) {
			System.out.println("Enter a String");
			String jk = kb.next();
			list.add(jk);
		}
		System.out.println("This is your whole list");
		for (int j = 0; j < amount; j++) {
			System.out.println(list.get(j));
		}
		System.out.println("Enter what you want to search for");
		String jk = kb.next();
		String ok = jk;
		System.out.println(list.indexOf(ok));

		System.out.println(list.indexOf(ok));

		list.sort();
		for (int k = 0; k < amount; k++) {
			System.out.println(list.get(k));
		}
	}
}

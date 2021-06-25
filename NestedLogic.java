import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Integer> returned = new ArrayList<>();
		List<Integer> due = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int input = scanner.nextInt();
			returned.add(input);
		}

		for (int i = 0; i < 3; i++) {
			int input = scanner.nextInt();
			due.add(input);
		}

		int yearsLate = returned.get(2) - due.get(2);

		int monthsLate = returned.get(1) - due.get(1);
		int daysLate = returned.get(0) - due.get(0);

		if (yearsLate > 0) {
			System.out.println(10000);
		} else if (yearsLate < 0) {
			System.out.println(0);
		} else if (monthsLate > 0) {
			System.out.println(500 * monthsLate);
		} else if (daysLate > 0) {
			System.out.println(15 * daysLate);
		} else {
			System.out.println(0);
		}

	}
}
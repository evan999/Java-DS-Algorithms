import java.io.*;
import java.util.*;

public class Solution {

	public static boolean isPrime(int testNum) {
		if (testNum == 1) {
			return false;
		}

		if (testNum == 2) {
			return true;
		}

		if (testNum % 2 == 0) {
			return false;
		}

		for (int num = 3; num <= (int) Math.sqrt(testNum); num++) {
			if (testNum % num == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();

		for (int test = 1; test <= testCases; test++) {
			int testNumber = input.nextInt();

			if (isPrime(testNumber)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
	}
}
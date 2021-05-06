import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'candies' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER n 2. INTEGER_ARRAY arr
	 */

	public static long candies(int n, List<Integer> arr) {
		// Write your code here
		int[] candies = new int[arr.size()];

		int current = 0;
		int next = 0;

		int candy = 1;

		for (int student = 0; student < arr.size() - 1; student++) {

			current = arr.get(student);
			next = arr.get(student + 1);

			if (student == 0) {
				current = arr.get(student);
				next = arr.get(student + 1);
				if (current < next) {
					candies[student] = 1;
					candies[student + 1] = candy++;
				} else if (current > next) {
					candies[student] = candy++;
					candy = 1;
					candies[student + 1] = candy;
				} else {
					candies[student] = 1;
					candies[student + 1] = 1;
				}
			}

			if (next > student) {
				candies[student + 1] = candy++;
			} else {
				candy = 1;
				candies[student + 1] = candy;
			}
		}

		// System.out.println(candies);

		// Get the sum of the candies
		int sum = 0;
		for (int num = 0; num < candies.length; num++) {
			sum += candies[num];
			System.out.println(candies[num]);
		}

		return sum;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		long result = Result.candies(n, arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
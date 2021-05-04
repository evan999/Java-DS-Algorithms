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
		List<Integer> candies = new ArrayList<>();

		for (int student = 0; student < arr.size() - 1; student++) {
			int candy = 1;
			if (arr.get(student) > arr.get(student + 1)) {
				candy++;
				candies.add(candy);
				System.out.println(candy);
			} else {
				candies.add(candy);
				candy++;
				candies.add(candy);
				System.out.println(candy);
			}
		}

		// Get the sum of the candies
		int sum = 0;
		for (int candy = 0; candy < candies.size(); candy++) {
			sum += candies.get(candy);
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
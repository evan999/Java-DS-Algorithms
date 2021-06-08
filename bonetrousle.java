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
	 * Complete the 'bonetrousle' function below.
	 *
	 * The function is expected to return a LONG_INTEGER_ARRAY. The function accepts
	 * following parameters: 1. LONG_INTEGER n 2. LONG_INTEGER k 3. INTEGER b
	 */

	public static List<Long> bonetrousle(long n, long k, int b) {
		// Write your code here
		// Intialize collection
		List<Long> results = new ArrayList<>();
		// Initialize fail collection where -1 will be added for fail condition
		List<Long> fail = new ArrayList<>();

		// long sum = 0;
		long sum = 0;
		long difference = n;

		// Fill collection with default values 1 to b
		// We may only need to loop through this once
		for (long index = 1; index <= b; index++) {
			results.add(index);
			sum += index;
		}

		// If sum of our initial collection > n
		if (sum > n) {
			fail.add(-1L);
			return fail;
		}

		if (sum == n) {
			return results;
		}

		if (sum < n && b == k) {
			fail.add(-1L);
			return fail;
		}

		// Set sum to initial sum of collection
		// long sum = initialSum;
		int curIndex = b - 1;

		if (sum < n) {
			while (curIndex > 0) {

				difference = n - sum;
				// Start from end of collection
				// Work our way towards the first element of collection
				// sum -= results.get(curIndex);
				long curNum = results.get(curIndex);
				long newNum = results.get(curIndex) + difference;
				results.set(curIndex, newNum);

				long add = newNum - curNum;
				sum += add; // add in difference between newNum and curNum
				// calculate new sum
				// sum += difference;
				newNum = add;
				if (newNum > k) {
					// If new element is greater than value of k
					// set array element to n-1
					// Otherwise, set to value of k
					if (k > n && newNum != n - 1) {
						// sum -= newNum;
						newNum = k - 1;
						// sum += newNum;
						results.set(curIndex, newNum);
					}

					if (k < n && newNum != k) {
						newNum = k;
						results.set(curIndex, newNum);
					}
				}

				// We have reached n and within the constraints of k
				// We are done!
				// Return collection
				if (sum == n && newNum <= k) {
					return results;
				}
				curIndex--;
				// System.out.println(results.get(results.size()-1));
			}

			// We are out of elements!
			if (sum < n) {
				fail.add(-1L);
				return fail;
			}
			// System.out.println(results);
		}
		return results;
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				long n = Long.parseLong(firstMultipleInput[0]);

				long k = Long.parseLong(firstMultipleInput[1]);

				int b = Integer.parseInt(firstMultipleInput[2]);

				List<Long> result = Result.bonetrousle(n, k, b);

				bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
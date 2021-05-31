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
	 * Complete the 'absolutePermutation' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER n 2. INTEGER k
	 */

	public static List<Integer> absolutePermutation(int n, int k) {
		// Write your code here
		List<Integer> permutation = new ArrayList<>();

		if (k == 0) {
			for (int index = 1; index <= n; index++) {
				permutation.add(index);
			}
			return permutation;
		}

		if (((n / k) % 2 != 0) || (n % k != 0)) {
			permutation.add(-1);
			return permutation;
		}

		for (int index = 0; index < n; index++) {
			if ((index / k) % 2 == 0) {
				permutation.add(index + k + 1);
			} else {
				permutation.add(index - k + 1);
			}
		}
		return permutation;
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

				int n = Integer.parseInt(firstMultipleInput[0]);

				int k = Integer.parseInt(firstMultipleInput[1]);

				List<Integer> result = Result.absolutePermutation(n, k);

				bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
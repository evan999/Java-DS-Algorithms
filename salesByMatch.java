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
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. INTEGER n
	 * 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		int pairs = 0;
		HashMap<Integer, Integer> colors = new HashMap<>();

		for (Integer sock : ar) {
			if (colors.containsKey(sock)) {
				colors.put(sock, colors.get(sock) + 1);
			} else {
				colors.put(sock, 1);
			}
		}
		// Convert hashmap values into collection of occurrences
		Collection<Integer> values = colors.values();
		List<Integer> occurrences = new ArrayList<Integer>(values);
		for (Integer value : occurrences) {
			pairs += (value / 2);
		}

		return pairs;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
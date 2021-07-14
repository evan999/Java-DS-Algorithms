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
	 * Complete the 'stockmax' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY prices as parameter.
	 */

	public static long stockmax(List<Integer> prices) {
		// Write your code here
		// initialize long variable to store total gained
		// total gained = 0
		// (recursive: no while loop)
		// while (collection size > 1)
		// sort prices collection into sorted collection descending

		// find highest price in sorted collection
		// could use indexOf instead of iterating to get index of highest price
		// spent = 0
		// shares = 0
		// iterate through initial collection prices up to highest price -> 0 through
		// max price i
		// if index of max price is 0
		// break, go to 42
		// spent += price at index
		// shares++
		// at max price index
		// sell all current shares
		// sold = price * shares
		// total gained += sold - spent
		// (recursive: return totalGained + stockmax(prices.get(i+1), end))
		// repeat from 26
		// remove elements from 0 to max price i
		// go to step 25 and repeat above lines 28-40 until base case is reached
		// repeat until collection size is <= 1
		// return total gained

		// if array is one or no element
		// return 0
		// find highest price index
		// for 0 to highest price index
		// calculate total gained from array
		// return totalGained + stockmax(prices.get(i+1, end))
		long totalGained = 0;
		List<Integer> sorted = new ArrayList<>(prices);
		Collections.sort(sorted, Collections.reverseOrder());
		// List<Integer> sorted = Collections.sort(prices, Collections.reverseOrder());
		int maxPrice = Collections.max(prices);
		int index = prices.indexOf(maxPrice);
		System.out.println(index);

		// while(prices.size() > 1) {
		// // Collections.sort(prices);
		// // int maxPrice = Collections.max(prices);
		// // prices.indexOf(maxPrice);
		// }

		return totalGained;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList());

				long result = Result.stockmax(prices);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}

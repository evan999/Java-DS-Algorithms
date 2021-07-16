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

	public static long stockmax(List<Integer> prices) {

		long totalGained = 0;

		while (prices.size() > 1) {
			int maxPrice = Collections.max(prices);
			int maxIndex = prices.indexOf(maxPrice);
			long spent = 0;
			long shares = 0;
			for (int index = 0; index <= maxIndex; index++) {
				if (maxIndex == 0) {
					break;
				}

				if (index == maxIndex) {
					long sold = prices.get(index) * shares;
					totalGained += sold - spent;
				} else {
					spent += prices.get(index);
					shares++;
				}
			}
			prices = prices.subList(maxIndex + 1, prices.size());
		}
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
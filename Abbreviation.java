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
	 * Complete the 'abbreviation' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING a 2. STRING b
	 */

	public static String abbreviation(String a, String b) {
		// Write your code here

		int[] intCharA = new int[a.length()];
		int[] intCharB = new int[b.length()];

		for (int aChar = 0; aChar < a.length(); aChar++) {
			intCharA[aChar] = a.charAt(aChar);
		}

		for (int bChar = 0; bChar < b.length(); bChar++) {
			intCharB[bChar] = b.charAt(bChar);
		}

		for (int aChar = 0; aChar < intCharA.length(); aChar++) {
			for (int bChar = 0; bChar < intCharB.length(); bChar++) {

			}
		}

		/*
		 * 
		 * for (int aChar = 0; aChar < a.length(); aChar++) { int asciiIntA =
		 * a.charAt(aChar); char asciiCharA = a.charAt(aChar);
		 * 
		 * for (int bChar = 0; bChar < b.length(); bChar++) {
		 * 
		 * if(asciiIntA >= 97 && asciiIntA <= 122) { // We know this would be lowercase
		 * if (asciiIntA + 32 == ) }
		 * 
		 * if(asciiIntA >= 65 && asciiIntA <= 90) { // We know this would be uppercase }
		 * } }
		 */
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String a = bufferedReader.readLine();

				String b = bufferedReader.readLine();

				String result = Result.abbreviation(a, b);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
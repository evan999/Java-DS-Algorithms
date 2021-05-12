import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the steadyGene function below.
	static int steadyGene(String gene) {

		HashMap<Character, Integer> chars = new HashMap<>();
		int len = gene.length();

		for (int ch = 0; ch < len; ch++) {
			if (chars.containsKey(gene.charAt(ch))) {
				chars.put(gene.charAt(ch), chars.get(gene.charAt(ch)) + 1);
			} else {
				chars.put(gene.charAt(ch), 1);
			}
		}

		System.out.println(chars);

		Iterator iterator = chars.entrySet().iterator();
		int smallestLength = 0;
		// System.out.println(len / 4);

		while (iterator.hasNext()) {
			Map.Entry<Character, Integer> element = (Map.Entry) iterator.next();
			int value = ((int) element.getValue());
			// System.out.println(value);
			if (value < (len / 4)) {
				int diff = (len / 4) - value;
				// System.out.println(diff);
				smallestLength += diff;
			} else if (value > (len / 4)) {
				int diff = value - (len / 4);
				System.out.println(diff);
			}

			// System.out.println(value);
		}

		return smallestLength;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String gene = scanner.nextLine();

		int result = steadyGene(gene);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
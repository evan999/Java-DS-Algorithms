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
	 * Complete the 'isBalanced' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String isBalanced(String s) {
		// Write your code here
		Stack<Character> chars = new Stack<>();
		// char[] strChars = s.toCharArray();
		for (int character = 0; character < s.length(); character++) {
			Character bracket = s.charAt(character);
			if (bracket.equals('(') || bracket.equals('[') || bracket.equals('{')) {
				chars.push(bracket);
			}

			if (bracket.equals(')') || bracket.equals(']') || bracket.equals('}')) {
				// if matching opening bracket is on top of stack
				// pop closing bracket at index
				if (bracket.equals(')')) {
					if ((chars.peek()).equals('(')) {
						chars.pop();
					} else {
						break;
					}
				}

				if (bracket.equals(']')) {
					if ((chars.peek()).equals('[')) {
						chars.pop();
					} else {
						break;
					}
				}

				if (bracket.equals('}')) {
					if ((chars.peek()).equals('{')) {

						chars.pop();
					} else {
						break;
					}
				}
			}
		}

		// System.out.println(chars);
		// System.out.println(chars.peek());
		if (!chars.empty()) {
			return "NO";
		}

		return "YES";
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String s = bufferedReader.readLine();

				String result = Result.isBalanced(s);

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
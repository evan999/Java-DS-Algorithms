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
		// convert string into char array
		// initialize stack
		// loop through chars in string
		// if char is opening bracket
		// push char to stack
		// else if char is closing bracket
		// pop top of stack
		// if popped char is not matching bracket
		// string not balanced
		// return "NO"
		// repeat until all chars have been traversed

		// if stack is empty
		// return "YES"
		// else
		// return "NO"

		char[] brackets = s.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char bracket : brackets) {
			if (bracket == '{' || bracket == '[' || bracket == '(') {
				stack.push(bracket);
			} else if ((bracket == '}') || (bracket == ']') || (bracket == ')')) {
				if (stack.empty()) {
					return "NO";
				}
				char popped = stack.pop();
				if (bracket == '}') {
					if (popped == '{') {
						continue;
					} else {
						return "NO";
					}
				}
				if (bracket == ']') {
					if (popped == '[') {
						continue;
					} else {
						return "NO";
					}
				}

				if (bracket == ')') {
					if (popped == '(') {
						continue;
					} else {
						return "NO";
					}
				}

			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}

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
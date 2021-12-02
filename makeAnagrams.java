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
	 * Complete the 'makeAnagram' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. STRING a
	 * 2. STRING b
	 */

	public static int makeAnagram(String a, String b) {
		// Write your code here
		final int CHARS = 26;
		int[] freq = new int[CHARS];

		for (int index = 0; index < a.length(); index++) {
			freq[a.charAt(index) - 'a']++;
		}

		for (int index = 0; index < b.length(); index++) {
			freq[b.charAt(index) - 'a']--;
		}

		int deletions = 0;
		for (int num = 0; num < 26; num++) {
			deletions += Math.abs(freq[num]);
		}

		return deletions;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String a = bufferedReader.readLine();

		String b = bufferedReader.readLine();

		int res = Result.makeAnagram(a, b);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
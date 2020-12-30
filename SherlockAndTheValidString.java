import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	static String isValid(String s) {
		HashMap<Character, Integer> characters = new HashMap<>();
		char[] chars = s.toCharArray();

		for (char ch : chars) {
			if (characters.containsKey(ch)) {
				characters.put(ch, characters.get(ch) + 1);
			} else {
				characters.put(ch, 1);
			}
		}

		Map<Integer, Integer> frequencies = new HashMap<>();
		for (int ch : characters.values()) {
			frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
		}

		if (frequencies.size() == 1) {
			return "YES";
		} else if (frequencies.size() > 2) {
			return "NO";
		} else {
			int maxValue = Collections.max(frequencies.entrySet(), Map.Entry.comparingByValue()).getKey();

			int deletions = 0;
			for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
				System.out.println(entry.getValue());
				int value = entry.getValue();
				if (value != maxValue) {
					if (deletions == 0) {
						if ((value - 1 == maxValue) || (value - 1 == 0)) {
							deletions++;
						} else {
							return "NO";
						}
					} else {
						return "NO";
					}
				}
			}
		}
		return "YES";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = isValid(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
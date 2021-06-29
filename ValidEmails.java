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

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine().trim());
		// create list
		ArrayList<String> names = new ArrayList<String>();
		IntStream.range(0, N).forEach(NItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				String firstName = firstMultipleInput[0];
				String emailID = firstMultipleInput[1];
				// if isEmailValid is true add firstname to list
				if (isEmailValid(emailID)) {
					names.add(firstName);
				}
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		// sort list
		Collections.sort(names);
		// output list
		for (String name : names) {
			System.out.println(name);
		}
		bufferedReader.close();
	}

	// Method create boolean isEmailValid(emailID)
	public static boolean isEmailValid(String emailID) {
		// Pattern(regex)
		Pattern pattern = Pattern.compile("^.*@gmail.com$");
		// match emailID to pattern
		Matcher matcher = pattern.matcher(emailID);
		// return match
		return matcher.matches();
	}
}
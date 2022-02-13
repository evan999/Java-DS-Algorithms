import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] clouds, int k) {
		// c[(i + k) % n]
		// e = 100
		// Character uses 1 unit of energy to make a jump of size k
		// to cloud c[(i + k) % n]
		// Thundercloud -> c[i] = 1
		// e - 2

		// c = [0, 0, 1, 0]
		// k = 2
		//

		// Declare energy integer variable
		int energy = 100;
		int index = 0;

		while (true) {
			if (clouds[index] == 1) {
				energy = energy - 2;
			}
			// if (clouds[index+k] == 1) {
			// energy -= 2;
			// }
			energy--;
		}
		// for (int index = 0; index < clouds.length; index++) {
		// int nextCloud = clouds[index+k] % clouds.length;
		// System.out.println(nextCloud);
		// }

		return energy;
		// Loop through clouds array
		// nextCloud = clouds[index+k]%n
		// energy - 1
		// if nextCloud is a thunderhead (clouds[index] = 1)
		// energy - 2
		//

		// The game ends when character lands on cloud 0
		// Determine the final value of e (energy) after the game ends
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

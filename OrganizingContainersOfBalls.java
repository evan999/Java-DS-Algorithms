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
	 * Complete the 'organizingContainers' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts 2D_INTEGER_ARRAY container as parameter.
	 */

	public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
        // containers = [[1,4],[2,3]]
        // container capacity = 5
        // To get capacity: add the balls in the subarray -> i + j
        // 1 + 4 = 5, 2 + 3 = 5
        // 7 red, 3 green
        // One container can hold 5 red
        // The other 2 red are stuck in container 1 with 3 green
        
        // Input:
        // First line -> q -> number of queries
        // Each of the next q sets of lines contains:
        //   First line contains an int n -> number of containers (rows)
        //   and ball types (columns)
        // Each of the next n lines contains n space-separated integers
        // describing containers[i]
        
        // If conditions can be satisfied, return string -> "Possible"
        // Else return "Impossible"
        
        // Example 1:
        // containers = [[1,4],[2,3]]
        // n = 2 containers (rows)
        // m = 2 ball types (cols)
        // containers numbered from 0 to n - 1
        
        // 4 balls of ball type 1
        // 3 balls of ball type 2
        // container 0 -> 1 of type 0, 4 of type 1
        // container 1 contains 2 of type 0, 3 of type 1 
        // We have more red than one container can fill
        // All green could go in one container, but 
        
        // What is the capacity of each container?
        
        // q = 2
        // n = 2
        // [[1,1],[1,1]]
        // Capacity = 2
        // 2 green, 2 red
        // We can fill both containers with the red in container 0 and green in container 1
        // Possible
        // [[0,2],[1,1]]
        // Impossible
        // Capacity = 2
        // 3 of type 1, 1 of type 0
        // capacity = 2
        // containers = 2
        // type 0 count < capacity size
        // To get the balls of each type:
        // Type 0: Index 0
        // Type 1: Index 1
        // ...
        // Add the balls of each type across subarrays
        // container[0][1] + container[1][1] -> type 1 balls
        // container[0][0] + container[1][0] -> type 0 balls
        
        // q = 2 (we don't need this)
        // n = 3 -> 3 containers
        // [1,3,1] 
        // [2,1,2]
        // [3,3,3]
        // capacity = 1 + 3 + 1 = 5 
        // 1 ball of type 0, 3 of type 1, 1 of type 2
        // 2 of type 0, 1 of type 1, 2 of type 2
        // 3 of type 0, 3 of type 1, 3 of type 2
        // totals: 6 of type 0, 7 of type 1, 6 of type 2
        // type 0 count > capacity 
        // Impossible
        // [0,2,1]
        // [1,1,1]
        // [2,0,0]
        // container[0] cap = 3
        // container[1] cap = 3
        // container[2] cap = 2
        // container 0: 0 of type 0, 2 of type 1, 1 of type 2
        // 1: 1 of type 0, 1 of type 1, 1 of type 2
        // 2: 2 of type 0, 0 of type 1, 0 of type 2
        // 3 of type 0, 3 of type 1, 2 of type 2
        // Possible
        
        // APPROACH:
        // Loop through 2D list (nested for -> 2 for loops)
        // for each row in container
        //  for each col in container[row]
        //    calculate container capacity
        //    capacity = container[0][col] + container[1][col] + container[2]               [col]
        //    sumBallType = container[row][col]
        //    if 
        List<Integer> bins = container.get(0)
        System.out.println(capacity);
        return "Possible";
        
        
        
        
        
    }

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<List<Integer>> container = new ArrayList<>();

				IntStream.range(0, n).forEach(i -> {
					try {
						container.add(
								Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
										.map(Integer::parseInt)
										.collect(toList()));
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				String result = Result.organizingContainers(container);

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

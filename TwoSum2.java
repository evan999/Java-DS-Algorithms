import java.util.*;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {
		HashMap<Integer, Integer> values = new HashMap<>();

		for (int index = 0; index < list.length; index++) {
			int complement = sum - list[index];
			if (values.containsKey(complement)) {
				return new int[] { values.get(complement), index };
			} else {
				values.put(list[index], index);
			}
		}

		return null;
	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
		if (indices != null) {
			System.out.println(indices[0] + " " + indices[1]);
		}
	}
}
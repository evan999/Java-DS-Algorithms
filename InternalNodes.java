import java.util.*;

public class InternalNodes {

	public static int count(int[] tree) {
		Set<Integer> uniqueNodes = new HashSet<>();

		for (int i = 0; i < tree.length; i++) {
			if (tree[i] != -1) {
				uniqueNodes.add(tree[i]);
			}
		}

		return uniqueNodes.size();
	}

	public static void main(String args[]) {
		System.out.println(InternalNodes.count(new int[] { 1, 3, 1, -1, 3 }));
	}
}
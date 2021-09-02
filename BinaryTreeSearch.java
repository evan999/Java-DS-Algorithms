import java.util.Scanner;

public class BinaryTreeSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfElms = sc.nextInt();
		int count = 1;

		BSTreeNode root = new BSTreeNode(sc.nextInt());
		while (count++ < numOfElms) {
			root.addNode(sc.nextInt());
		}

		int numOfQs = sc.nextInt();
		int[] queries = new int[numOfQs];
		for (int i = 0; i < numOfQs; i++) {
			queries[i] = sc.nextInt();
		}

		int[] result = isPresent(root, queries);
		for (int num : result) {
			System.out.println(num);
		}
	}

	private static int[] isPresent(BSTreeNode root, int[] queries) {
		// code here

	}
}

class BSTreeNode {
	int value;
	BSTreeNode left = null;
	BSTreeNode right = null;

	public BSTreeNode(int value) {
		this.value = value;
	}

	public void addNode(int nodeValue) {
		if (nodeValue <= value) {
			if (left == null)
				left = new BSTreeNode(nodeValue);
			else
				left.addNode(nodeValue);
		} else {
			if (right == null)
				right = new BSTreeNode(nodeValue);
			else
				right.addNode(nodeValue);
		}
	}
}
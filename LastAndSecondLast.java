public class Solution {

	public static String lastLetters(String word) {
		// String substr = word.substring(word.length()-1, word.length()-3);
		// return substr;
		StringBuilder str = new StringBuilder(word);
		// System.out.println(str.reverse());
		String reverseStr = str.reverse().toString();
		return reverseStr.substring(0, 1) + " " + reverseStr.substring(1, 2);

	}

	public static void main(String args[]) {
		String word = "bat";
		System.out.println(lastLetters(word));
	}
}
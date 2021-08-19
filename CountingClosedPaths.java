public class CountingClosedPaths {

	public static int countClosedPaths(int number) {
		/*
		 * initialize a variable to store total closedPaths loop through each digit
		 * (character) of the number if digit is equal to 0, 4, 6, or 9 add 1 to closed
		 * paths else if digit is equal to 8 add 2 to closed paths else go to next digit
		 * 
		 * return total closed paths
		 */
		int closedPaths = 0;
		String num = Integer.toString(number);
		for (int digit = 0; digit < num.length(); digit++) {
			if (num.charAt(digit) == '0' || num.charAt(digit) == '4' || num.charAt(digit) == '6'
					|| num.charAt(digit) == '9') {
				closedPaths++;
			} else if (num.charAt(digit) == '8') {
				closedPaths += 2;
			}
		}

		return closedPaths;
	}

	public static void main(String args[]) {
		System.out.println(countClosedPaths(value));
	}
}
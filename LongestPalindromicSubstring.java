class Solution {
	public String longestPalindrome(String s) {

		// Palindrome is a string that is the same in reverse

		// Need to extract substrings from the string
		// Store longest string
		// Brute force
		// Loop through string nested for loop
		// extract substrings from string
		// if substring is palindrome
		// check if substring length is greater than longest palindrome string
		// if yes -> change longestPalindrome to current substring

		String longestPalindrome = "";

		if (s.length() == 1) {
			return s;
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String substr = s.substring(i, j);
				StringBuilder sb = new StringBuilder(substr);
				String reverse = sb.reverse().toString();
				// System.out.println(reverse);
				if (reverse.equals(substr)) {
					if (substr.length() > longestPalindrome.length()) {
						longestPalindrome = substr;
					}
				}
				// System.out.println(substr);
			}
		}

		return longestPalindrome;
	}
}
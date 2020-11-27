class Solution {
	public int countSubstrings(String s) {
		if (s.length() <= 1) {
			return 1;
		}

		int palindromeCount = 0;

		StringBuilder sb = new StringBuilder(s);

		/*
		 * if(s.charAt(0) == s.charAt(s.length()-1)){ if(sb.equals(sb.reverse())){
		 * palindromeCount++; } }
		 */

		for (int i = 0; i < s.length(); i++) {
			// Add in single char substrings
			// System.out.println("palindromeCount++");
			palindromeCount++;
			for (int j = i + 1; j < s.length() - 1; j++) {
				String st = s.substring(i, j);
				String reverseSt = s.substring(j) + s.substring(i, j);
				if (st.equals(reverseSt)) {
					// System.out.println("palindrome");
					palindromeCount++;
				}
			}
		}

		return palindromeCount;
	}
}
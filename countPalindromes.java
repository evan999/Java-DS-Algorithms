class Solution {
	public int countSubstrings(String s) {

		int palindromes = 0;

		if (s.length() == 1) {
			return 1;
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String substr = s.substring(i, j);

				StringBuilder sb = new StringBuilder(substr);

				if ((sb.toString()).equals((sb.reverse()).toString())) {
					palindromes++;
				}
			}
		}

		return palindromes;
	}
}

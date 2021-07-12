class Solution {
	public int numPairsDivisibleBy60(int[] time) {
		// (time[i] + time[j]) % 60 == 0
		//
		// time = [30, 20, 150, 100, 40]
		// Brute force:
		// Two pointers, i and j
		// For each
		// We can count the number of songs with (length % 60) equal to r, and
		// store that in an array of size 60

		//
		HashMap<Integer, Integer> remainders = new HashMap<>();
		int pairs = 0;

		for (int index = 0; index < time.length; index++) {
			int remainder = time[index] % 60;
			if (remainder == 0) {
				if (remainders.containsKey(remainder)) {
					pairs++;
				}
			}

			if (remainders.containsKey(60 - remainder)) {
				pairs++;
			}

			if (remainders.containsKey(remainder)) {
				remainders.put(remainder, remainders.get(remainder) + 1);
			} else {
				remainders.put(remainder, 1);
			}
		}

		return pairs;
	}
}
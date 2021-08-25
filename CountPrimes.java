class Solution {
	public int countPrimes(int n) {

		if (n < 2) {
			return 0;
		}

		if (n == 2) {
			return 0;
		}
		int primesCount = 0;

		// Is number odd?
		for (int num = 2; num < n; num++) {
			if (isPrime(num)) {
				primesCount++;
			}
		}

		return primesCount;

		// for (int num = 3; num < Math.sqrt(n); num++) {
		// if (num % 2 == 0) {
		// System.out.println("Not prime");
		// continue;
		// }

		// if (n % num == 0) {
		// System.out.println("Not prime");
		// continue;
		// }

		// primesCount++;
		// }

		// return primesCount;
	}

	public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}

		for (int num = 3; num * num <= n; num += 2) {
			if (n % num == 0) {
				return false;
			}
		}

		return true;
	}
}
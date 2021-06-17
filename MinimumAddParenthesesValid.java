class Solution {
	public int minAddToMakeValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || stack.empty() == true) {
				stack.add(c);
			} else {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					stack.add(c);
				}
			}
		}

		return stack.size();
	}
}
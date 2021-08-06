public class Solution {

	public int[] countFrequency(String str) {
		int[] frequency = new int[256];
		// char[] characters = str.toCharArray();

		// Loop through each character in our string
		// increment our freq array
		// case-sensitive, each unique character
		// frequency[str.charAt(position)]++
		for (int position = 0; position < str.length(); position++) {
			frequency[str.charAt(position)]++; // retrieve the occurrences of each char in the string

			// System.out.println(frequency[str.charAt(position)]);
		}

		for (int index = 0; index < frequency.length; index++) {
			// Print unique character in each string
			if (frequency[index] == 0) {
				continue;
			}
			System.out.print(Character.toString((char) index));
			System.out.println(" " + frequency[index]);
			// UTF-8 4 byte character
			// One byte -> 1 character
			// If UTF-8 instead of ASCII, how would we change this method?
			// What if this string was coming in from a file?
			// Could we use this same approach?
			//
		}

		// Translate array of integers into output
		// Identify how many of each character
		// Loop through each character in array
		// If character matches ascii character -> grab ascii value from array
		// print character and value
		// else
		// continue

		// System.out.println(frequency);
		return frequency;
	}

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.countFrequency("hello");
		// System.out.println(hello.countFrequency("hello"));
	}
}
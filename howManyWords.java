class Result {

    /*
     * Complete the 'howMany' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING sentence as parameter.
     */

    public static int howMany(String sentence) {
    // Write your code here
        // Words:
        // -Must be within a-z or A-Z range of characters ('13' is not a word)
        // -May contain one or more hyphens, may end in a punctuation mark
        // -Separated by one or more white space characters
        // -Hyphens join two words into one word (counts as one word, not two!)
        
        // Return int number of words in string

        // 1. Get all the words in the string

        // sentence.split()?;

        // Create new string array
        String[] words = sentence.split("\\s+");
        int wordCount = words.length;

        // Loop through words array to remove punctuation marks.
        for(int word = 0; word < words.length; word++){
            // Print the words
            // Word by word, replace all punctuation marks with empty character
            words[word] = words[word].replaceAll("[^\\w]", "");
            System.out.println(words[word]);
            String curWord = words[word];
            for(int c = 0; c < curWord.length(); c++){
                if((curWord.charAt(c) >= 'a') && (curWord.charAt(c) <= 'z') || (curWord.charAt(c) >= 'A' && curWord.charAt(c) <= 'Z')){
                    continue;
                }
                else{
                    // Not a valid word!
                    wordCount--;
                    System.out.println("Invalid");
                    break;
                }
            }
        }

        // Need to check each word for non-alphabetical characters.
        // If there's an invalid character, it's not a valid word.



        return wordCount;

    }

}
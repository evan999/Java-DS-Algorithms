class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        // Use hashmap to count occurrences of characters
        // A string is palindrome if each character occurs even number of times
        char[] chars = s.toCharArray();
        
        for(char ch : chars){
            if(!(map.containsKey(ch))){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        
        int countOdd = 0;
        
        if(map.size() == 1){
            return true;
        }
        
        for(int i = 0; i < chars.length; i++){
            int value = map.get(chars[i]);
            if(value%2!=0){
                countOdd++;
                System.out.println(value + " Odd");
            }
            
            // If we ever track a character appearing an odd number of times
            // increment count of odd character occurrences. If this exceeds 1, return false
            // Not palindrome with more than one character appearing an odd number of times!
            if(countOdd > 1){
                return false;
            }
        }
        
        
        return true;
    }
}
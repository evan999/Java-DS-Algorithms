class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        if(s.length() == 0){
            return false;
        }
        
        if(s.length() % 2 != 0){
            return false;
        }
        
        
        for(int ch = 0; ch < s.length(); ch++){
            if(s.charAt(ch) == '(' || s.charAt(ch) == '[' || s.charAt(ch) == '{'){
                stack.push(s.charAt(ch));
            }
            
            if(s.charAt(ch) == ')' || s.charAt(ch) == ']' || s.charAt(ch) == '}'){
                if(stack.size() > 0){
                    if(stack.peek() == '(' && s.charAt(ch)==')'){
                        stack.pop();
                    }
                    else if(stack.peek()== '[' && s.charAt(ch) == ']'){
                        stack.pop();
                    }
                    else if(stack.peek()=='{' && s.charAt(ch) == '}'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }  
                }
                else{
                    return false;
                }
            }
        }
        
        if(stack.size() > 0){
            return false;
        }
        
        return true;
    }
}
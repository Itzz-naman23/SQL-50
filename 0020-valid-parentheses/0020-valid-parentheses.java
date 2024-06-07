class Solution {
    public boolean isValid(String s) {
        
       Stack<Character> stack = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            
            //check for opening
            if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
            }
            // closing
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek()=='('  &&ch==')') ||
                   (stack.peek()=='{' && ch=='}') ||
                   (stack.peek()=='[' && ch==']') ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else return false;
    }
}
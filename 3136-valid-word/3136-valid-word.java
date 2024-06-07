class Solution {
    public boolean isValid(String word) {
        
        if(word.length() < 3){
            return false;
        }
        
        boolean containsVowels = false;
        boolean containsConsonant = false;
        
        for(char ch: word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if("aeiouAEIOU".indexOf(ch) != -1){
                containsVowels = true;
            }else if("aeiouAEIOU".indexOf(ch)==-1 && Character.isAlphabetic(ch)){
                containsConsonant = true;
            }
        }
        
        return containsVowels && containsConsonant;
        
        
       
    }
}
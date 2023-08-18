import java.lang.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.toLowerCase());
        
        answer.setCharAt(0, Character.toUpperCase(answer.charAt(0)));
        
        for(int i=0;i<s.length()-1;i++){
            if(answer.charAt(i)==' '){
                answer.setCharAt(i+1, Character.toUpperCase(answer.charAt(i+1)));
            }
        }
        
        return answer.toString();
    }
}
import java.lang.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int idx = c-1;
        
        for(int i=0;i<my_string.length();i++){
            answer.append(my_string.charAt(idx));
            idx = idx + m;
            
            if(idx>=my_string.length()){
                break;
            }
        }
        
        return answer.toString();
    }
}
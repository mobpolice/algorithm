import java.lang.*;

class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        int point = 0;
        
        for(int i=0;i<n_str.length();i++){
            
            if(n_str.charAt(i)!='0'){
                point = i;
                break;
            }
            
        }
        
        for(int i=point;i<n_str.length();i++){
            
            answer.append(n_str.charAt(i));
            
        }
        
        return answer.toString();
    }
}
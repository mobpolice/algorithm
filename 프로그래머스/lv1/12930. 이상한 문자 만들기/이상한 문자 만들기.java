import java.lang.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer.append(s.charAt(i));
                idx = 0;
            }else if(idx%2==0){
                answer.append(Character.toUpperCase(s.charAt(i)));
                idx++;
            }else{
                answer.append(Character.toLowerCase(s.charAt(i)));
                idx++;
            }
        }
        
        return answer.toString();
    }
}
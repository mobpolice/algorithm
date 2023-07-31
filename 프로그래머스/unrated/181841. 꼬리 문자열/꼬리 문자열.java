import java.lang.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        
        for(String s : str_list){
            if(s.indexOf(ex)==-1){
                answer.append(s);
            }
        }
        
        return answer.toString();
    }
}
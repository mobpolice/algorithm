import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        
        Arrays.sort(answer, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        
        for(String a : answer){
            sb.append(a);    
        }
        return sb.toString();
    }
}
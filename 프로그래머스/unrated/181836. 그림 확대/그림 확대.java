import java.util.*;
import java.lang.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuilder sb = new StringBuilder();
        
        Arrays.fill(answer, "");
        
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<picture[0].length();j++){
                for(int l=0;l<k;l++){
                    sb.append(picture[i/k].charAt(j));
                }
                answer[i] = sb.toString();
            }
            sb.setLength(0);
        }
    
        return answer;
    }
}
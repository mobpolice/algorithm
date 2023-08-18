import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        if(max%min==0){
            answer[0] = min;    
        }else{
            for(int i=min;i>=1;i--){
                if(max%i==0 && min%i==0){
                    answer[0] = i;
                    break;
                }
            }
        }
        
        answer[1] = max*min/answer[0];
        
        return answer;
    }
}
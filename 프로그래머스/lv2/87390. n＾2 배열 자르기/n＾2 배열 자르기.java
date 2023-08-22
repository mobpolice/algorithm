import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        long idx = left;
        long a = 0;
        long b = 0;
        
        for(int i=0;i<answer.length;i++){
            a = idx/n;
            b = idx%n;
            
            if(a>=b){
                answer[i] = (int)a+1;
            }else{
                answer[i] = (int)b+1;
            }
            idx++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            if(n/3==0){
                sb.append(n%3);
                break;
            }else{
                sb.append(n%3);
                n = n/3;
            }
        }
        
        answer = Integer.parseInt(sb.toString(),3);
        
        return answer;
    }
}
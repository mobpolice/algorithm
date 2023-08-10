import java.util.*;

class Solution {
    public long[] solution(long n) {
        ArrayList<Long> answer = new ArrayList<Long>();
        
        while(true){
            answer.add(n%10);
            if(n/10!=0){
                n = n/10;
            }else{
                break;
            }
        }
        
        return answer.stream().mapToLong(i->i).toArray();
    }
}
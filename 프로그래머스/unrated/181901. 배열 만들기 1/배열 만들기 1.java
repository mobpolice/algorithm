import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=1;i<=n;i++){
            
            if(n>=(k*i)){
                answer.add((k*i));
            }
            
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
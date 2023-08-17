import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    set.add(j);            
                }
            }
            
            if(set.size()%2==0){
                answer += i;
            }else{
                answer -= i;
            }
            
            set.clear();
        }
        
        return answer;
    }
}
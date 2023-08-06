import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        answer.add(n);
        int idx = 0;
        
        while(true){
            if(answer.get(idx)%2==0){
                answer.add(answer.get(idx)/2);
                idx++;
            }else{
                if(answer.get(idx)==1){
                    break;
                }else{
                    answer.add(answer.get(idx)*3+1);
                    idx++;
                }
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
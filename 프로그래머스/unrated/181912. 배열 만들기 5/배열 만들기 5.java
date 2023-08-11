import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int temp = 0;
        
        for(int i=0;i<intStrs.length;i++){
            temp = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(temp>k){
                answer.add(temp);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
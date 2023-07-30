import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        
        while(i<=n){
            list.add(i);
            i+=2;
        }
        
        int[] answer = new int[list.size()];
        
        for(int j=0;j<list.size();j++){
            answer[j]=list.get(j).intValue();
        };
        
        return answer;
    }
}
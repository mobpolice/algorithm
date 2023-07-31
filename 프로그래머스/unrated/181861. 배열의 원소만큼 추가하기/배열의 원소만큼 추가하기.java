import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr[i];j++){
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
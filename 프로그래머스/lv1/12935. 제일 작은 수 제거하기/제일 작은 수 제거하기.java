import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = arr.clone();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        Arrays.sort(arr2);
        int min = arr2[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                answer.add(arr[i]);
            }
        }
        
        if(arr.length==1){
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int a : arr){
            list.add(a);
        }
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
        list.clear();
        list.addAll(set);
        
        for(int i=0;i<Math.min(k, list.size());i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
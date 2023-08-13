import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<array.length;i++){
            list.add(Math.abs(array[i]-n));    
        }
        
        int min = Collections.min(list);
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)==min){
                answer = array[i];
                break;
            }
        }
        
        return answer;
    }
}
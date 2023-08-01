import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int a : arr){
            arrList.add(a);
        }
        
        for(int d : delete_list){
            arrList.remove(Integer.valueOf(d));
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
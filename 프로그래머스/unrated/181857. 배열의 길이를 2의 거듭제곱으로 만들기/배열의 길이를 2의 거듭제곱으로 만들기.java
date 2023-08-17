import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int temp = 0;
        
        for(int a : arr){
            answer.add(a);
        }
        
        for(int i=1;i<arr.length;i++){
            temp = (int)Math.pow(2,i);
            
            if(answer.size()==temp){
                break;
            }
            
            if(answer.size()<temp){
                for(int j=0;j<temp-arr.length;j++){
                    answer.add(0);
                }
                break;
            }
            
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
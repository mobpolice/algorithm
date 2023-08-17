import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int a = 0;
        int b = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                a = i;
                break;
            }
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                b = i;
                break;
            }
        }

        if(a + b == 0){
            answer.add(-1);
        }else{
            for(int i=a;i<=b;i++){
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
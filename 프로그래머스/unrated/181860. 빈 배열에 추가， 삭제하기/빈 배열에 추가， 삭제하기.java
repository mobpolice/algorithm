import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int a=0;a<2*arr[i];a++){
                    stack.push(arr[i]);
                }
            }else{
                for(int b=0;b<arr[i];b++){
                    stack.pop();
                }
            }
        }        
        
        return stack.stream().mapToInt(i->i).toArray();
    }
}
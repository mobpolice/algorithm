import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;
        
        if(n==1){
            a = 0;
        }else if(n==2){
            b = num_list.length-1;
        }else if(n==3){
            
        }else{
            c = slicer[2];
        }
        
        for(int i=a;i<=b;i+=c){
            answer.add(num_list[i]);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
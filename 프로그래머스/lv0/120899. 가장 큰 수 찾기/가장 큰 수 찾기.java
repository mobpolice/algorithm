import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int max = Arrays.stream(array).max().getAsInt();
        int index = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]==max){
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}
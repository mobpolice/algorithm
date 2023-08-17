import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int num = 1+((k-1)*2);
        
        for(int i=0;i<=num;i++){
            for(int j=0;j<numbers.length;j++){
                answer.add(numbers[j]);
            }
        }
        
        return answer.get(num-1);
    }
}
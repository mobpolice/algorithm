import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        long[] arr = {a, b};
        Arrays.sort(arr);
        
        for(long i=arr[0];i<=arr[1];i++){
            answer += i;
        }
        
        return answer;
    }
}
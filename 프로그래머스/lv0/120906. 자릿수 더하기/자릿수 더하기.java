import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();    
    
        int answer = 0;
        
        for(int d : digits){
            answer += d;
        }
        
        return answer;
    }
}
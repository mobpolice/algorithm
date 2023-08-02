import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int plus = numbers[numbers.length-1] * numbers[numbers.length-2];
        int minus = numbers[0] * numbers[1];
        
        return answer = plus>minus ? plus : minus;
    }
}
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        
        int[] answer = IntStream.range(num1, num2+1).map(num -> numbers[num]).toArray();
        return answer;
    }
}
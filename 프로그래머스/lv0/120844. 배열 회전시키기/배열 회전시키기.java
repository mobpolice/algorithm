import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        Queue<Integer> answer = new LinkedList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            answer.add(numbers[i]);
        }        
        
        if(direction.equals("left")){
            answer.add(answer.poll());
        }else{
            for(int i=0;i<numbers.length-1;i++){
                answer.add(answer.poll());
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
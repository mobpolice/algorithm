import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        String[] strArr = Long.toString(n).split("");
        
        for(String str : strArr){
            answer.add(Integer.parseInt(str));
        }
        
        Collections.reverse(answer);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
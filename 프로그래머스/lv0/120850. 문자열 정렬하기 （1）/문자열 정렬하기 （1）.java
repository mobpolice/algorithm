import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(char m : my_string.toCharArray()){
            if(Character.isDigit(m)){
                list.add(Character.getNumericValue(m));
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
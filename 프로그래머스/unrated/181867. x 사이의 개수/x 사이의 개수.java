import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        String[] array = myString.split("x");
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0;i<array.length;i++){
            answer.add(array[i].length());
        }
        
        if(myString.lastIndexOf("x")==myString.length()-1){
            answer.add(0);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] array = myString.split("x");
        
        ArrayList<String> answer = new ArrayList<String>();
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            if(!array[i].equals("")){
                answer.add(array[i]);
            }    
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        
        for(String d : dic){
            String[] arr = d.split("");
            Arrays.sort(arr);
            
            if(Arrays.equals(spell, arr)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
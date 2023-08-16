import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        ArrayList<Character> test = new ArrayList<Character>();
        String answer = "";
        
        test.add('-');
        for(int i=0;i<arr.length;i++){
            test.add(arr[i]);
        }
        test.add('-');
        
        for(int i=1;i<test.size()-1;i++){
            if(test.get(i-1)!=test.get(i) && test.get(i)!=test.get(i+1)){
                answer += Character.toString(test.get(i));
            }
        }
        
        return answer;
    }
}
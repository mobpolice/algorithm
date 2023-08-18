import java.util.*;

class Solution {
    boolean solution(String s) {
        Queue<Character> queue = new LinkedList<Character>();
        boolean answer = true;
        int a = 0;
        
        for(char c : s.toCharArray()){
            queue.add(c);
        }
        
        for(int i=0;i<s.length();i++){
            if(queue.poll() == '('){
                if(a>=0){
                    a += 1;    
                }else{
                    answer = false;
                    break;
                }
            }else{
                if(a>0){
                    a -= 1;    
                }else{
                    answer = false;
                    break;
                }
            }
        }
        
        if(a!=0){
            answer = false;
        }       
        
        return answer;
    }
}
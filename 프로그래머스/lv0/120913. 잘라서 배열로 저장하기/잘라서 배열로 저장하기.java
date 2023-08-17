import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i=0;i<my_str.length();i+=n){
            if(my_str.length()>=i+n){
                answer.add(my_str.substring(i,i+n));
            }else{
                answer.add(my_str.substring(i));
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
import java.lang.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        
        sb.reverse();
        
        return answer.replace(s, e+1, sb.toString()).toString();
    }
}
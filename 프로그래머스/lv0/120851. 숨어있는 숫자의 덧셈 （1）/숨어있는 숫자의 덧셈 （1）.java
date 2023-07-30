import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String my_int = my_string.replaceAll("[^0-9]","");
        
        for(char a : my_int.toCharArray()){
            answer += (int)a - '0';
        }
        
        return answer;
    }
}
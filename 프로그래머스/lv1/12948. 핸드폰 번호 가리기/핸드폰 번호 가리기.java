import java.lang.*;

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        StringBuilder star = new StringBuilder();
        
        for(int i=0;i<phone_number.length()-4;i++){
            star.append("*");
        }
        answer.replace(0, answer.length()-4, star.toString());
        
        return answer.toString();
    }
}
import java.lang.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuffer answer = new StringBuffer(my_string);

        answer.replace(num1,num1+1,String.valueOf(my_string.charAt(num2)));
        answer.replace(num2,num2+1,String.valueOf(my_string.charAt(num1)));

        return answer.toString();
    }
}
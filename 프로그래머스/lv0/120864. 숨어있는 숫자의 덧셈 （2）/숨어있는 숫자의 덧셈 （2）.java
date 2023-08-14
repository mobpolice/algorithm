import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        String[] arr = my_string.toLowerCase().replaceAll("[a-z]","-").split("");
        
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("-")){
                temp += arr[i];
            }else{
                if(!temp.equals("")){
                    answer += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        
        if(!temp.equals("")){
            answer += Integer.parseInt(temp);
        }
        
        return answer;
    }
}
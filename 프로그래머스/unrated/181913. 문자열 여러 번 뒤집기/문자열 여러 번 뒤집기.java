import java.lang.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        int start, end;
        StringBuilder temp;
        
        for(int i=0;i<queries.length;i++){
            start = queries[i][0];
            end = queries[i][1]+1;
            temp = new StringBuilder(answer.substring(start, end));
            
            answer.replace(start, end, temp.reverse().toString());
        }
        
        return answer.toString();
    }
}
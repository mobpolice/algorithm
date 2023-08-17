import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(String s : strArr){
            answer.add(s.length());
        }
        
        int cnt = 0;

        for(int i=1;i<=30;i++){
            if(Collections.frequency(answer, i)>cnt){
                cnt = Collections.frequency(answer, i);
            }
        }
        
        return cnt;
    }
}
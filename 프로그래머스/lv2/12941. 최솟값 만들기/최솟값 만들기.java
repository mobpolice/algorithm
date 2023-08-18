import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        int idx = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int j=B.length-1;j>=0;j--){
            answer += A[idx++]*B[j];
        }

        return answer;
    }
}
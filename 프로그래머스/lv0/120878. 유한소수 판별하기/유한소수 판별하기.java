import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        for(int i=a;i>=2;i--){
            if(a%i==0 && b%i==0){
                a = a/i;
                b = b/i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=b;i++){
            while(b%i==0){
                list.add(i);
                b = b/i;
            }
        }
        
        for(int i : list){
            if(i!=2 && i!=5){
                answer = 2;
            }
        }
        
        if(answer!=2){
            answer = 1;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int temp = n;
        
        for(int i=0;i<=n;i++){
            if(temp!=1){
                for(int j=2;j<=n;j++){
                    if(temp%j==0){
                        temp = temp/j;
                        answer.add(j);
                        break;
                    }
                }
            }else{
                break;
            }
        }
        
        return answer.stream().distinct().mapToInt(i->i).toArray();
    }
}
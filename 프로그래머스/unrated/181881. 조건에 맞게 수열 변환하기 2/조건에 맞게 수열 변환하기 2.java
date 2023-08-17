import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(arr.clone());
        
        for(int a=1;a<1000;a++){
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i] = arr[i]*2+1;
                }
            }
            list.add(arr.clone());

            if(Arrays.equals(list.get(a-1), list.get(a))){
                answer = a-1;
                break;
            }
            
        }
        
        return answer;
    }
}
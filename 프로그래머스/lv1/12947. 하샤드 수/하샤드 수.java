class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int temp = x;
        int sum = 0;
        
        for(int i=1;i<=x;i++){
            if(temp%10!=0){
                sum += temp%10;
                temp = temp/10;
            }else{
                sum += temp/10;
                break;
            }
        }
        
        if(x/sum>0 && x%sum==0){
            answer = true;
        }
        
        return answer;
    }
}
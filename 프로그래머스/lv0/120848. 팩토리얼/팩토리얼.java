class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            if(factorial(i)<=n){
                answer = i;
            }else{
                break;
            }
        }
        
        return answer;
    }
    
    public int factorial(int i){
        
        if(i==1){
            return 1;
        }else{
            return i * factorial(i-1);
        } 
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                if(i%j==0 && i/j>0){
                    temp++;
                }
            }
            if(temp>=3){
                answer++;
            }
            temp = 0;
        }
        
        return answer;
    }
}
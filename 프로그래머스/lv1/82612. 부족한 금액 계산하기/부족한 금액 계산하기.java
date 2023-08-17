class Solution {
    public long solution(int price, int money, int count) {
        long charge = 0;
        
        for(int i=1;i<=count;i++){
            charge += price*i;
        }
        
        long answer = charge-money;
        
        if(answer<=0){
            answer = 0;
        }
        
        return answer;
    }
}
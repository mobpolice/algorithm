class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        
        while(true){
            if((pizza*6)%n==0){
                answer = pizza;
                break;
            }else{
                pizza++;
            }
        }
        
        return answer;
    }
}
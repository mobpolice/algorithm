class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int p = 0;p<1000;p++){
            if(p*7/n>0){
                answer = p;
                break;
            }
        }

        return answer;
    }
}
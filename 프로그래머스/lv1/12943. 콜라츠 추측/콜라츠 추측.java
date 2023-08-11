class Solution {
    public int solution(int num) {
        int answer = 0;
        long testNum = num;
        
        if(num==1){
            answer = 0;
        }else{
            for(int i=0;i<500;i++){
                if(testNum%2==0){
                    testNum = testNum/2;
                    answer++;
                }else if(testNum%2==1 && testNum!=1){
                    testNum = (testNum*3)+1;
                    answer++;
                }else{
                    break;
                }
            }
            if(answer>=500){
                answer = -1;
            }
        }
        
        return answer;
    }
}
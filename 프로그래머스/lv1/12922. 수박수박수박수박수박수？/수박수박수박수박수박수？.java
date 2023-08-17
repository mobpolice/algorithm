class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0;i<(n+1)/2;i++){
            answer += "수박";
        }
        
        if(n%2==0){
            return answer.substring(0, answer.length());
        }else{
            return answer.substring(0, answer.length()-1);
        }
        
    }
}
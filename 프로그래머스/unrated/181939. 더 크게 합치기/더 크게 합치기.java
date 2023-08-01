class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        
        int answer = ab;
    
        if(ab>ba){
            answer = ab;
        }else if(ab<ba){
            answer = ba;
        }
        
        return answer;
    }
}
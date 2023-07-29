class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        double d1 = num1;
        double d2 = num2;
        
        answer = (int)(d1/d2*1000);
        
        return answer;
    }
}
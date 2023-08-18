class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        for(int i=share-1;i>=0;i--){
            answer *= balls-i;
            answer /= share-i;
        }
        
        return answer;
    }
}
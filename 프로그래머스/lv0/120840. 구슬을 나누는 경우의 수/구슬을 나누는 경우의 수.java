class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        
        for(int i=share-1;i>=0;i--){
            answer *= balls-i;
            answer /= share-i;
        }
        
        return (int)answer;
    }
}
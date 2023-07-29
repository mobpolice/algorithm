class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int a = 0;a<array.length;a++){
            
            if(array[a]>height){
                answer += 1;
    
            }
            
        }
        
        return answer;
    }
}
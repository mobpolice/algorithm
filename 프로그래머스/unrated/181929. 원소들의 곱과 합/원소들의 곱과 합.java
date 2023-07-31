class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multiple = 1;
        int sum = 0;
        
        for(int n : num_list){
            sum += n;
            multiple *= n;
        }
        
        if(multiple<Math.pow(sum,2)){
            answer = 1;
        }
        
        return answer;
    }
}
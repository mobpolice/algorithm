class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp = 0;
        
        for(int i=0;i<num_list.length;i++){
            temp = num_list[i];
            
            while(true){
                if(temp%2==0){
                    temp = temp/2;
                    answer++;
                }else if(temp%2==1 && temp!=1){
                    temp = (temp-1)/2;
                    answer++;
                }else{
                    break;
                }
            }
            
        }
        
        return answer;
    }
}
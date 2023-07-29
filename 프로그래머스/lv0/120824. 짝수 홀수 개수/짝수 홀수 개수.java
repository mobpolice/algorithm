class Solution {
    public int[] solution(int[] num_list) {
        
        int z = 0;
        int h = 0;
        
        for(int i : num_list){
            if(i%2==1){
                System.out.println("홀");
                h += 1;
            }else{
                System.out.println("짝");
                z += 1;
            }
        }
        int[] answer = {z, h};
        
        return answer;
    }
}
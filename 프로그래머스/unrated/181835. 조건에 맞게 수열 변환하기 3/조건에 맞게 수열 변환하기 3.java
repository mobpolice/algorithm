class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        if(k%2==1){
            for(int a=0;a<arr.length;a++){
                answer[a]=(arr[a]*k);
            }
        }else{
            for(int a=0;a<arr.length;a++){
                answer[a]=(arr[a]+k);
            }
        }
        
        return answer;
    }
}
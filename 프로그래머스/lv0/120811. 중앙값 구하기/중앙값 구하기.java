class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        answer = array[array.length/2];
        
        return answer;
    }
}
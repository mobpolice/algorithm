class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int t = 0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]>numbers[i]){
                    t = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = t;
                }
            }
        }
        answer = numbers[0]*numbers[1];
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int temp = 0;

        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j++){
                answer[j] = arr[j] + 1;
            }
        }
        
        return answer;
    }
}
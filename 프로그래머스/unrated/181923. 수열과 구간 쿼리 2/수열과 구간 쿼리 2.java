class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int s = 0;
        int e = 0;
        int k = 0;
        int min = 1000000;
        
        for(int a=0;a<queries.length;a++){
            s = queries[a][0];
            e = queries[a][1];
            k = queries[a][2];
            for(int i=s;i<=e;i++){
                min = arr[i]<=min && arr[i]>k ? arr[i] : min;
            }
            
            if(min!=1000000){
                answer[a] = min;   
            }else{
                answer[a] = -1;
            }
            min = 1000000;
        }
        
        
        return answer;
    }
}
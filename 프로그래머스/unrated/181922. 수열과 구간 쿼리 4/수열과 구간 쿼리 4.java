class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int s = 0;
        int e = 0;
        int k = 0;
        
        for(int a=0;a<queries.length;a++){
            s = queries[a][0];
            e = queries[a][1];
            k = queries[a][2];
            for(int i=s;i<=e;i++){
                if(i%k==0){
                    arr[i] += 1;
                }
            }
        }
        
        return arr;
    }
}
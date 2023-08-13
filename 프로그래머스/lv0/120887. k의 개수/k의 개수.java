class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] arr;
        
        for(int idx=i;idx<=j;idx++){
            arr = String.valueOf(idx).split("");
            for(int a=0;a<arr.length;a++){
                if(arr[a].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int[] i = new int[n+1];
        i[0] = 0%1234567;
        i[1] = 1%1234567;
        
        for(int j=2;j<=n;j++){
            i[j] = (i[j-1]%1234567 + i[j-2]%1234567)%1234567;
        }
        
        return i[n];
    }
}
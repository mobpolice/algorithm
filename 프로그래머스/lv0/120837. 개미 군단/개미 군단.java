class Solution {
    public int solution(int hp) {
        
        int a = hp/5;
        int n = (hp%5)/3;
        int t = ((hp%5)%3)/1;
        
        return a+n+t;
    }
}
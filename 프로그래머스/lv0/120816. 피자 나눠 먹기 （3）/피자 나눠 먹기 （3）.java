class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        
        for(int p=0;p<n;p++){
            
            if(pizza*slice/n>0){
                break;
            }
            pizza++;
        }
        
        return pizza;
    }
}
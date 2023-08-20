class Solution {
    
    int[] answer = new int[2];
        
    public int[] solution(String s) {
        
        toBinary(s);
        
        return answer;
    }
    
    public String toBinary(String s){
                
        String a = "";
        int zero = 0;
        
        for(char c : s.toCharArray()){
            if(c == '0'){
                zero += 1;
            }else{
                a += c;
            }
        }
        
        answer[0]++;
        answer[1] += zero;
        
        if(Integer.toBinaryString(a.length()).equals("1")){
            return null;
        }else{
            return toBinary(Integer.toBinaryString(a.length()));    
        }
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String reversed = "";
        
        for(String m : myString.split("")){
            
            if(m.equals("A")){
                reversed += "B";
            }else{
                reversed += "A";
            }
            
        }
        
        if(reversed.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}
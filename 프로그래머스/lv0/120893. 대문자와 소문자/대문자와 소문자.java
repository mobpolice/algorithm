class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char m : my_string.toCharArray()){
            if(Character.isUpperCase(m)){
                answer += Character.toLowerCase(m);
            }else{
                answer += Character.toUpperCase(m);
            }
        }
        
        return answer;
    }
}
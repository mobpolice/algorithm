class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(char a:my_string.toCharArray()){
            sb.append(a);
        }
        answer = sb.reverse().toString();
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] answer = my_string.split("");
        
        for(int i : indices){
            answer[i] = "";
        }
        
        return String.join("", answer);
    }
}
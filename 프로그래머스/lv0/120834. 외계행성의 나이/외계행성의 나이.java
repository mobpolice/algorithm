class Solution {
    public String solution(int age) {
        String answer = "";
        
        char[] age_array = Integer.toString(age).toCharArray();

        for(int i=0;i<age_array.length;i++){
            answer += (char)((int)age_array[i] + 49);
        }
        
        return answer;
    }
}
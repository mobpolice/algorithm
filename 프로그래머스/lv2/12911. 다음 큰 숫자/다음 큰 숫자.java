class Solution {
    public int solution(int n) {
        int answer = n+1;
        String binary_n = Integer.toBinaryString(n);
        int count_n = countChar(binary_n, '1');
        String binary_answer = "";
        
        while(true){
            binary_answer = Integer.toBinaryString(answer);
            
            if(answer>n && count_n==countChar(binary_answer, '1')){
                break;
            }else{
                answer++;
            }
        }
        
        return answer;
    }
    
    public int countChar(String str, char ch){
        int count = 0;
        
        for(char s : str.toCharArray()){
            if(s == ch){
                count++;
            }
        }
        
        return count;
    }
}
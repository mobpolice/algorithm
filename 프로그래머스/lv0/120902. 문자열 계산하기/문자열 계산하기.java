class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        
        answer = Integer.parseInt(arr[0]);
        int temp = 0;
        
        for(int i=1;i<arr.length-1;i+=2){
            temp = Integer.parseInt(arr[i+1]);
            
            if(arr[i].equals("+")){
                answer += temp;
            }else{
                answer -= temp;
            }
            
        }
        
        return answer;
    }
}
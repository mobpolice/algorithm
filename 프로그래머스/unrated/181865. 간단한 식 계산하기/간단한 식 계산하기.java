class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] expression = binomial.split(" ");
        
        int num1 = Integer.parseInt(expression[0]);
        String operator = expression[1];
        int num2 = Integer.parseInt(expression[2]);
        
        if(operator.equals("+")){
            answer = num1 + num2;
        }else if(operator.equals("-")){
            answer = num1 - num2;
        }else if(operator.equals("*")){
            answer = num1 * num2;
        }else{
            answer = num1 / num2;
        }
        
        return answer;
    }
}
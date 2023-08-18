import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for(char s : str.toCharArray()){
            if(Character.isUpperCase(s)){
                answer += Character.toLowerCase(s);
            }else{
                answer += Character.toUpperCase(s);
            }
        }
        
        System.out.println(answer);
    }
}
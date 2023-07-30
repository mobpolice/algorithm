class Solution {
    public String solution(String myString) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<myString.length();i++){
            
            if(myString.charAt(i)=='a'){
                sb.append(Character.toUpperCase(myString.charAt(i)));
            }else if(myString.charAt(i)=='A'){
                sb.append(myString.charAt(i));
            }else{
                sb.append(Character.toLowerCase(myString.charAt(i)));
            }
            
        }
        
        return sb.toString();
    }
}
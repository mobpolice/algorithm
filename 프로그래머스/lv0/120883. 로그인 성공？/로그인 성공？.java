class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(String[] d : db){
            if(d[0].equals(id_pw[0]) && d[1].equals(id_pw[1])){
                answer = "login";
                break;
            }else if(d[0].equals(id_pw[0]) && !d[1].equals(id_pw[1])){
                answer = "wrong pw";
                break;
            }
        }
        
        return answer;
    }
}
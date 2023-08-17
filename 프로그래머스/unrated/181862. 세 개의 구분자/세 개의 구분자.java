import java.util.*;
import java.lang.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> answer = new ArrayList<String>();
        
        String temp = myStr.replaceAll("[abc]","-");
        StringBuilder a = new StringBuilder();
        
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)!='-'){
                a.append(temp.substring(i,i+1));
            }else{
                if(!a.toString().equals("")){
                    answer.add(a.toString());
                    a.setLength(0);
                }
            }
        }
        
        if(!a.toString().equals("")){
            answer.add(a.toString());
            a.setLength(0);
        }
        
        if(answer.size()==0){
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
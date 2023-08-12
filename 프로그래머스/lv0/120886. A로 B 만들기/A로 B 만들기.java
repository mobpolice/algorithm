import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        ArrayList<String> bList = new ArrayList<String>(Arrays.asList(before.split("")));
        ArrayList<String> aList = new ArrayList<String>(Arrays.asList(after.split("")));        
        
        Collections.sort(bList);
        Collections.sort(aList);
        
        for(int i=0;i<bList.size();i++){
            if(!bList.get(i).equals(aList.get(i))){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}
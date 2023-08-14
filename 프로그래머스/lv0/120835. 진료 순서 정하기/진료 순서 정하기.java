import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] copy = Arrays.stream(emergency)
                        .boxed()
                        .toArray(Integer[]::new);
        Arrays.sort(copy, Comparator.reverseOrder());
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<copy.length;j++){
                if(emergency[i]==copy[j]){
                    answer.add(j+1);
                    break;
                }
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] ranks = new int[score.length];
        int rank = 1;
        
        for(int i=0;i<score.length;i++){
            avg[i] = (score[i][0]+score[i][1])/(double)score[i].length;
        }
        
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(avg[i]<avg[j]){
                    rank++;
                }
            }
            ranks[i] = rank;
            rank = 1;
        }
        
        return ranks;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        
        for(int i=0;i<dots.length-1;i++){
            if(width<Math.abs(dots[i][0]-dots[i+1][0])){
                width = Math.abs(dots[i][0]-dots[i+1][0]);
            }
            
            if(height<Math.abs(dots[i][1]-dots[i+1][1])){
                height = Math.abs(dots[i][1]-dots[i+1][1]);
            }
        }
        
        return width*height;
    }
}
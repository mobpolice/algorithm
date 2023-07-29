class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max = sides[0];
        for(int s=0;s<sides.length;s++){
            if(sides[s]>max){
                max = sides[s];
            }
        }
        int all = 0;
        for(int s:sides){
            all+=s;
        }
        if((all-max)>max){
            answer = 1;
        }
        return answer;
    }
}
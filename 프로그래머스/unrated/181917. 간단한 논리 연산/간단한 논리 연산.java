class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        return b(a(x1, x2), a(x3, x4));
    }
    
    public boolean a(boolean i, boolean j){
        if(i || j){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean b(boolean i, boolean j){
        if(i && j){
            return true;
        }else{
            return false;
        }
    }
}
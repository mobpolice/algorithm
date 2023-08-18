import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger aInt = new BigInteger(a);
        BigInteger bInt = new BigInteger(b);
        
        return aInt.add(bInt).toString();
    }
}
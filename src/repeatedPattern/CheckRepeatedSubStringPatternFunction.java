package repeatedPattern;

public class CheckRepeatedSubStringPatternFunction {
    // A cool solution
    // Worst case, O(m*n), best case is O(m+n) depends on how to compare string
    // public boolean repeatedSubstringPattern(String s) {
    //     String str = s + s;
    //     return str.substring(1, str.length() - 1).contains(s);
    // }
    
    public boolean repeatedSubstringPattern(String s){
        int l = s.length();
        
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(s)) return true;
            }
	}
	return false;
    }
}

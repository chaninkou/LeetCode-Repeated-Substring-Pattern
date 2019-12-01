package repeatedPattern;

public class CheckRepeatedSubStringPatternFunction {
    // A cool solution
    // Worst case, O(m*n), best case is O(m+n) depends on how to compare string
    // public boolean repeatedSubstringPattern(String s) {
    //     String str = s + s;
    //     return str.substring(1, str.length() - 1).contains(s);
    // }
    
    public boolean repeatedSubstringPattern(String s){
        int totalLength = s.length();
        
        for(int i = totalLength / 2; i >= 1; i--){
        	// Only check if they are even
        	if(totalLength % i == 0){
        		// Number of time it repeat
        		int repeat = totalLength / i;
        		
        		// Get current substring to check
        		String currentWord = s.substring(0, i);
        		
        		// To store string
        		StringBuilder sb = new StringBuilder();
        		
        		// Store the currentword to the sb with the number of repeat
        		for(int j = 0; j < repeat; j++){
        			sb.append(currentWord);
        		}
        		
        		// After storing, check if sb contain the original string
        		if(sb.toString().equals(s)){
        			return true;
        		}
        	}
        }
        // If it gets here, that means there is no pattern
        return false;
    }
}

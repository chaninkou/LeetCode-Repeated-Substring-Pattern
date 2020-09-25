package leetcode459;

public class Main {
	public static void main(String[] args) {
		String s = "abcabc";
		
		System.out.println("Input: " + s);
		
		CheckRepeatedSubStringPatternFunction solution = new CheckRepeatedSubStringPatternFunction();
		
		System.out.println("Solution: " + solution.repeatedSubstringPattern(s));
	}
}

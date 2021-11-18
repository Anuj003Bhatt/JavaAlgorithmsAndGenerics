package com.anuj.intotoalgo.executormain;


class Solution{
	
	public static int compareString(String word1, String word2, String order) {
		int[] charIndices = new int[26];
		// ba
		// [1,0] - a b c d 
		for(int i=0;i<order.length();i++) {
			int actualIndex = order.charAt(i) -'a';
			charIndices[actualIndex] = i;
		}
		int length1 = word1.length();
		int length2 = word2.length();
		
		for(int i=0; i<length1 && i<length2 ;i++) {
			int compareOut = (charIndices[word1.charAt(i)-'a'] - charIndices[word2.charAt(i)-'a']);
			if( compareOut > 0 ) {
				return 1;
			}else if (compareOut < 0){
				return -1;
			}
		}
		
		// At this point the all chars are equal
		return length1-length2;
		
	}
	
	public static boolean isAlienSorted(String[] words, String order) {
		if(words.length==1) {
			return true;
		}
		
//		Boolean ascending = (words[0].compareTo(words[1]) > 0)?true:false;
		
		for(int i=0;i<words.length-1;i++) {
			if( compareString(words[i],words[i+1],order) > 0) {
				return false;
			}
		}
		
		return true;
	}

}



public class ExecutorMain {
	//	anurag.s@chargebee.com
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = new String[] {"hello","leetcode"};
		String naturalOrder = "abcdefghijklmnopqrstuvwxyz";
		String order1 = "lhabcdefgijkmnopqrstuvwxyz";
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		
		System.out.println(Solution.isAlienSorted(test,order));
		System.out.println(Solution.isAlienSorted(test,order1));
		System.out.println(Solution.isAlienSorted(test,naturalOrder));
//		System.out.println(Solution.compareString("leetcode","hello",order));  
	}

}

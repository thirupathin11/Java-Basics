package com.test;

public class UpperAndLowerCaseWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "Everybody is opting in BTech";
		int upperCasewordsCnt=0, lowerCaseWrodsCnt =0;
		String testStringArr[] = testString.split(" ");
		for(int i=0;i<testStringArr.length-1;i++) {
			
			if(!testStringArr[i].isEmpty() && Character.isUpperCase(testStringArr[i].charAt(0))) {
				upperCasewordsCnt++;
			}else {
				lowerCaseWrodsCnt++;
			}
		}
		System.out.println("Uppercase words count:"+upperCasewordsCnt);
		System.out.println("Lowercase words count:"+lowerCaseWrodsCnt);
	}

}

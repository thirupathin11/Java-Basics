package com.test;

public class LastWordofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Hello World";
		
		String strArr[] = str.split(" ");
		
		//System.out.println(strArr[strArr.length-1].length());
		
		for(int i = 0;i<strArr.length;i++) {
			
			String s1 =strArr[i];
			
			//System.out.println(s1);
			String tmp ="";
			for(int j=s1.length()-1;j>=0;j--) {
				//System.out.println(s1.charAt(j));
				tmp = tmp+s1.charAt(j);
				
			}
			System.out.print(tmp+" ");
			/*
			 * String tmp = ""; for(int j = s1.length()-1;j>=0;j--) { tmp =
			 * tmp+tmp.charAt(j); } System.out.println(tmp);
			 */			
		}
		
	}

}

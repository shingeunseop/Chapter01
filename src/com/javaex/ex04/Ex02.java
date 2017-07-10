package com.javaex.ex04;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arry= new int[6];
		for(int i=0;i<arry.length;i++) {
		arry[i]=(int)(Math.random()*45)+1;
		System.out.print(" "+arry[i]);
		}
	}

}

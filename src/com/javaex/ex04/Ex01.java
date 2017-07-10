package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {


		/*int no1=(int)(Math.random()*45)+1;
		int no2=(int)(Math.random()*45)+1;
		int no3=(int)(Math.random()*45)+1;
		int no4=(int)(Math.random()*45)+1;
		int no5=(int)(Math.random()*45)+1;
		int no6=(int)(Math.random()*45)+1;
		System.out.print(no1);
		System.out.print("  "+no2);
		System.out.print("  "+no3);
		System.out.print("  "+no4);
		System.out.print("  "+no5);
		System.out.print("  "+no6);*/
		for(int i=1; i<=6;i++) {
			int num=(int)(Math.random()*45)+1;
			System.out.print("  "+num);
		}
		

	}

}

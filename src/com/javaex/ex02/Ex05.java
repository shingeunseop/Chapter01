package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���:");
		Scanner sc= new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=90)
			System.out.println("A���");
		else if(score>=80)
			System.out.println("B���");
		else if(score>=70)
			System.out.println("C���");
		else if(score>=60)
			System.out.println("D���");
		else
			System.out.println("F���");
		sc.close();

	}

}

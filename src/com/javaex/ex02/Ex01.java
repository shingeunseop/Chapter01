package com.javaex.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		int num=sc.nextInt();
		
		if(num>=60)
		{
			System.out.println("합격입니다.");
		}
		else
			System.out.println("불합격입니다.");
		sc.close();
	}

}

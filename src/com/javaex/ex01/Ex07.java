package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String str=sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		String age=sc.nextLine();
		System.out.println("당신의 이름은 "+str+" 나이는 "+age+" 입니다.");
		
		sc.close();
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자:");
		int num=sc.nextInt();
		System.out.println("입력하신 숫자는 "+num+" 입니다.");
		sc.close();*/
		
	}

}

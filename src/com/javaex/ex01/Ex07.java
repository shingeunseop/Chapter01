package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		System.out.print("�̸�:");
		String str=sc.nextLine();
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����:");
		String age=sc.nextLine();
		System.out.println("����� �̸��� "+str+" ���̴� "+age+" �Դϴ�.");
		
		sc.close();
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.print("����:");
		int num=sc.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� "+num+" �Դϴ�.");
		sc.close();*/
		
	}

}

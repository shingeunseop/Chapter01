package com.javaex.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int num=sc.nextInt();
		
		if(num>=60)
		{
			System.out.println("�հ��Դϴ�.");
		}
		else
			System.out.println("���հ��Դϴ�.");
		sc.close();
	}

}

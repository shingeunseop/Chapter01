package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������ �����ϼ���");
		System.out.println("(1.�ڹ� 2.C 3.C++ 4.���̽�)");
		int code=sc.nextInt();
		if(code==1)
			System.out.println("R101ȣ �Դϴ�.");
		else if(code==2)
			System.out.println("R202ȣ �Դϴ�.");
		else if(code==3)
			System.out.println("R303ȣ �Դϴ�.");
		else if(code==4)
			System.out.println("R404ȣ �Դϴ�.");
		else
			System.out.println("�������� ���� �ϼ���");
		sc.close();
	}
	
	

}

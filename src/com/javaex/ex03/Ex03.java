package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("���ڸ� �Է��ϼ���");
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("����");
				break;
			}
			if(num%3==0) {
				System.out.println("3�� ����Դϴ�.");
				}
			else 
				System.out.println("3�� ����� �ƴմϴ�.");
			
			
			
		}
		sc.close();
		

	}

}

package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է� �ϼ���");
		int dan=sc.nextInt();
		for(int i=1;i<10;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		sc.close();
		/*int i=1;
		
		while(i<10)
		{
			System.out.println(dan+ "*"+ i+ "=" +dan*i);
			i++;
		}
		sc.close();*/
		

	}

}
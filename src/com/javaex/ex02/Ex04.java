package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���.");
		Scanner sc= new Scanner(System.in);
		int month=sc.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		default:
			System.out.println("28��");
			break;
		}
		sc.close();

	}

}
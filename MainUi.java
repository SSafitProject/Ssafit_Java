package com.ssafy.fit.ui;

import java.util.Scanner;

public class MainUi {

	static Scanner sc = new Scanner(System.in);

	// 1������ ���������� ����
	public static void service() {
		System.out.println("---------------------------");
		System.out.println("�ڹٷ� �����ϴ� SSAFIT");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("1. �� �� �� ��");
		System.out.println("0. �� ��");
		System.out.println("---------------------------");
		System.out.print("���ϴ� �޴��� �����ϼ��� : ");

		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("---------------------------");
			System.out.println("1. �� �� �� ��");
			System.out.println("0. �� �� ȭ ��");
			System.out.println("---------------------------");
			System.out.print("���ϴ� �޴��� �����ϼ��� : ");
			int b = sc.nextInt();
			if (b == 1)
				VideoUi.listVideo();
			else if (b == 0)
				return;
		} else if (a == 0)
			exit();

	}

	// 0 ������ ����
	static void exit() {
		System.out.println("�����մϴ�");
	}
}

package com.ssafy.fit.ui;

import java.util.Scanner;

public class MainUi {

	static Scanner sc = new Scanner(System.in);

	// 1눌러서 영상정보로 들어가기
	public static void service() {
		System.out.println("---------------------------");
		System.out.println("자바로 구현하는 SSAFIT");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("1. 영 상 정 보");
		System.out.println("0. 종 료");
		System.out.println("---------------------------");
		System.out.print("원하는 메뉴를 선택하세요 : ");

		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("---------------------------");
			System.out.println("1. 영 상 목 록");
			System.out.println("0. 이 전 화 면");
			System.out.println("---------------------------");
			System.out.print("원하는 메뉴를 선택하세요 : ");
			int b = sc.nextInt();
			if (b == 1)
				VideoUi.listVideo();
			else if (b == 0)
				return;
		} else if (a == 0)
			exit();

	}

	// 0 눌러서 종료
	static void exit() {
		System.out.println("종료합니다");
	}
}

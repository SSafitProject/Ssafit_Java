package com.ssafy.fit.ui;

import java.util.Scanner;

public class VideoUi {
	static Scanner sc = new Scanner(System.in);

	private IVideo ivideo = new IVideo();

	private static VideoUi instance = new VideoUi();

	// 생성자
	private VideoUi() {
	}

	public static VideoUi getInstance() {
		return instance;
	}

	public static void service() {

	}

	// 1눌러서 영상목록
	private static void listVideo() {
		System.out.println("---------------------------");
		System.out.println("전체 8개");
		System.out.println("---------------------------");
		System.out.println("1    전신 전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]");
		System.out.println("2    전신 하루 15분! 전신 칼로리 불태우는 다이어트 운동");
		System.out.println("3    상체 상체 다이어트 최고의 운동 BEST [팔뚝살 /겨드랑이살 /등살 /가슴 어깨라인]");
		System.out.println("4    상체 상체비만 다이어트 최고의 운동 [상체 핵매운맛]");
		System.out.println("5    하체 하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]");
		System.out.println("6    하체 저는 하체 식주의자 입니다.");
		System.out.println("7    복부 11자복근 복부 최고의 운동 [복근 핵매운맛]");
		System.out.println("8    복부 (Sub)누워서하는 5부 복부운동! 효과보장! (매일 2주만 해보세요!");
		System.out.println("---------------------------");
		System.out.println("1. 영 상 상 세");
		System.out.println("0. 이 전 화 면");
		System.out.println("---------------------------");
		System.out.print("원하는 메뉴를 선택하세요 : ");
		int c = sc.nextInt();
		if (c == 1)
			detailVideo();
		else if (c == 0)
			service();

	}

	// 1 눌러서 영상정보(상세)
	private static void detailVideo() {
		System.out.println("---------------------------");
		System.out.println("1. 영 상 상 세");
		System.out.println("0. 이 전 화 면");
		int d = sc.nextInt();
		if (d == 1) {
			System.out.println("---------------------------");
			System.out.print("영상번호를 입력하세요 : ");
		} else if (d == 0) {
			listVideo();
		}

	}
}

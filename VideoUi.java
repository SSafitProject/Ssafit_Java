package com.ssafy.fit.ui;

import java.util.Scanner;

public class VideoUi {
	static Scanner sc = new Scanner(System.in);

	private IVideo ivideo = new IVideo();

	private static VideoUi instance = new VideoUi();

	// ������
	private VideoUi() {
	}

	public static VideoUi getInstance() {
		return instance;
	}

	public static void service() {

	}

	// 1������ ������
	private static void listVideo() {
		System.out.println("---------------------------");
		System.out.println("��ü 8��");
		System.out.println("---------------------------");
		System.out.println("1    ���� ���� ���̾�Ʈ �ְ��� � [Į���� �� ���ٸſ��]");
		System.out.println("2    ���� �Ϸ� 15��! ���� Į�θ� ���¿�� ���̾�Ʈ �");
		System.out.println("3    ��ü ��ü ���̾�Ʈ �ְ��� � BEST [�ȶһ� /�ܵ���̻� /��� /���� �������]");
		System.out.println("4    ��ü ��ü�� ���̾�Ʈ �ְ��� � [��ü �ٸſ��]");
		System.out.println("5    ��ü ��ü��� �߿��� ����? �̰͸� ���� �������� ! [��ü� ������]");
		System.out.println("6    ��ü ���� ��ü �������� �Դϴ�.");
		System.out.println("7    ���� 11�ں��� ���� �ְ��� � [���� �ٸſ��]");
		System.out.println("8    ���� (Sub)�������ϴ� 5�� ���ο! ȿ������! (���� 2�ָ� �غ�����!");
		System.out.println("---------------------------");
		System.out.println("1. �� �� �� ��");
		System.out.println("0. �� �� ȭ ��");
		System.out.println("---------------------------");
		System.out.print("���ϴ� �޴��� �����ϼ��� : ");
		int c = sc.nextInt();
		if (c == 1)
			detailVideo();
		else if (c == 0)
			service();

	}

	// 1 ������ ��������(��)
	private static void detailVideo() {
		System.out.println("---------------------------");
		System.out.println("1. �� �� �� ��");
		System.out.println("0. �� �� ȭ ��");
		int d = sc.nextInt();
		if (d == 1) {
			System.out.println("---------------------------");
			System.out.print("�����ȣ�� �Է��ϼ��� : ");
		} else if (d == 0) {
			listVideo();
		}

	}
}

package Chapters.chapter02.tasks.task8;

import java.util.Scanner;

public class GetMounth {
private int numerMounth;
Scanner scan;
public GetMounth() {
	this.numerMounth=numerMounth;
	scan= new Scanner(System.in);
	numerMounth=scan.nextInt();
}
public void getSomeMounth() {
	switch(numerMounth) {
	case 0:
		System.out.println("������ ������ ��� � ����");
	break;
	case 1:
		System.out.println("������");
		break;
	case 2:
		System.out.println("�������");
		break;
	case 3:
		System.out.println("����");
		break;
	case 4:
		System.out.println("������");
		break;
	case 5:
		System.out.println("���");
		break;
	case 6:
		System.out.println("����");
		break;
	case 7:
		System.out.println("����");
		break;
	case 8:
		System.out.println("������");
		break;
	case 9:
		System.out.println("��������");
		break;
	case 10:
		System.out.println("�������");
		break;
	case 11:
		System.out.println("������");
		break;
	case 12:
		System.out.println("�������");
		break;
	default:
		System.out.println("Wrong Mounth");
		break;
	}
}
}

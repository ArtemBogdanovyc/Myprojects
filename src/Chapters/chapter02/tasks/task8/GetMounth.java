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
		System.out.println("Такого месяца нет в году");
	break;
	case 1:
		System.out.println("Январь");
		break;
	case 2:
		System.out.println("Февраль");
		break;
	case 3:
		System.out.println("Март");
		break;
	case 4:
		System.out.println("Апрель");
		break;
	case 5:
		System.out.println("Май");
		break;
	case 6:
		System.out.println("Июнь");
		break;
	case 7:
		System.out.println("Июль");
		break;
	case 8:
		System.out.println("Август");
		break;
	case 9:
		System.out.println("Сентябрь");
		break;
	case 10:
		System.out.println("Октябрь");
		break;
	case 11:
		System.out.println("Ноябрь");
		break;
	case 12:
		System.out.println("Декабрь");
		break;
	default:
		System.out.println("Wrong Mounth");
		break;
	}
}
}

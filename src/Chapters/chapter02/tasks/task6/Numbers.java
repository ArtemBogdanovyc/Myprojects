package Chapters.chapter02.tasks.task6;

import java.util.Scanner;

public class Numbers {
private int someNumber;
public static final int minNumber=-10000;
public static final int maxNumber=10000;
Scanner scan;
public Numbers(){
	this.someNumber=someNumber;
	scan=new Scanner(System.in);
	someNumber=scan.nextInt();
	
}
public void getBorderNumber() {
	switch(someNumber>=minNumber & someNumber<=0 ? 0:1) {
	case 0:
		System.out.println("����� � ��������� �� (-10� �� 0)");
		break;
	case 1:
		switch (someNumber>=0 & someNumber<= 5 ? 0:1) {
		case 0:
			System.out.println("����� � ��������� �� (0 �� 5 )");
			break;
		case 1:
			switch(someNumber>=5 & someNumber<=10 ? 0:1) {
			case 0:
				System.out.println("����� � ��������� �� (5 �� 10)");
				break;
			case 1:
				switch(someNumber>=10 & someNumber<=maxNumber ? 0:1) {
				case 0:
					System.out.println("����� � ��������� �� (10 �� 10�)");
					break;
				case 1:
					System.out.println("����� �� �  ���������");
					break;
				}
			}
		
		}
	}
}
}

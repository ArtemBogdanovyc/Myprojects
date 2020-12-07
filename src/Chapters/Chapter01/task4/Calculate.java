package Chapters.Chapter01.task4;

import java.util.Scanner;

public class Calculate {
private int number1;
private int number2;
private int sum;
Scanner in;
public Calculate() {
	in= new Scanner(System.in);
	this.number1=number1;
	this.number2=number2;
	this.sum=sum;
}
public void getSum() {
	number1=in.nextInt();
	number2=in.nextInt();
	sum=number1+number2;
	System.out.println(sum);
}
}

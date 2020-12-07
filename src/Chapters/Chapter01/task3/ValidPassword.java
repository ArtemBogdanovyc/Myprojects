package Chapters.Chapter01.task3;

import java.util.Scanner;

public class ValidPassword {
	private int password;
	Scanner in;
		public ValidPassword(int password){
		this.password=password;
		in=new Scanner(System.in);
		
	}
public void equalPasswods() {
	int passScan=in.nextInt();
	if(passScan==password) {
		System.out.print("Good to see you");
	}else {
		System.out.print("Wrong Password Bro");
	}
}
}

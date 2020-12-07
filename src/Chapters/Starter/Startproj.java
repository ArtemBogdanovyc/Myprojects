package Chapters.Starter;

import Chapters.Chapter01.task1.Greeting;
import Chapters.Chapter01.task2.Stroki;
import Chapters.Chapter01.task3.ValidPassword;
import Chapters.Chapter01.task4.Calculate;
import Chapters.Chapter01.task5.DateTakeTask;

public class Startproj {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
 Greeting greet = new Greeting();
 greet.getGreeting("Hey boys i am love programming");
 Stroki strok = new Stroki(4);
 strok.getStringsInLine();
 strok.getStringsInColum();
 ValidPassword valid = new ValidPassword(12345);
 valid.equalPasswods();
 Calculate calc= new Calculate();
 calc.getSum();
 DateTakeTask dateTask= new DateTakeTask("Artem", "Bogdanovych");
 dateTask.getTask();
	}

}

package Chapters.chapter02.tasks.task3;

import java.util.Scanner;

public class AverageString {
	private int quantity;
	private String[] strings;
	Scanner scan;
	private int averageStr;
		public AverageString(int quantity) {
		this.quantity=quantity;
		strings=new String[quantity];
		scan= new Scanner(System.in);
		for(int i=0 ; i<strings.length;i++) {
			strings[i]=scan.next();	
		}
			
	}
	public void getAverage() {
		for(int i=0; i<strings.length-1;i++) {
			averageStr=strings[i].length()+strings[i+1].length()/quantity;
			if(strings[i].length()!=averageStr) {
				System.out.println(strings[i]);
			}
		}
	}
 }


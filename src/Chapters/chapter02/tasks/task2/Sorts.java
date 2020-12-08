package Chapters.chapter02.tasks.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorts {
	private int quantity;
	private String[] strings;
	Scanner scan;
	private boolean ind=false;
	private String buf;
	public Sorts(int quantity) {
		this.quantity=quantity;
		
		strings=new String[quantity];
		scan= new Scanner(System.in);
		for(int i=0 ; i<strings.length;i++) {
			strings[i]=scan.next();	
		}
	}
public void getSort() {
	while(!ind) {
		ind=true;
			for(int i=0 ; i<strings.length-1;i++) {
			if(strings[i].length()>strings[i+1].length()) {
				ind=false;
				buf= strings[i];
				strings[i]=strings[i+1];
				strings[i+1]=buf;
				
			
			}
				}
	}
		System.out.println(Arrays.toString(strings));
		
	}
	public void getSortMin() {
		while(!ind) {
			ind=true;
				for(int i=0; i<strings.length-1;i++) {
			if(strings[i].length()<strings[i+1].length()) {
				ind=false;
				buf = strings[i];
				strings[i]=strings[i+1];
				strings[i+1]=buf;
		}
	}
		}
		System.out.println(Arrays.toString(strings));

}
}
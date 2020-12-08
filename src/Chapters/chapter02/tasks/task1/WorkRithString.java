package Chapters.chapter02.tasks.task1;

import java.util.Arrays;
import java.util.Scanner;

public class WorkRithString {
private int quantity;
private String[] strings;
Scanner scan;
private int indMax=0;
private int indMin=0;
private String buf;
public WorkRithString(int quantity) {
	this.quantity=quantity;
	this.indMax=indMax;
	this.indMin=indMin;
	strings=new String[quantity];
	scan= new Scanner(System.in);
}
public String[] getStrings() {
	for (int i=0; i<strings.length ; i++) {
		strings[i]=scan.next();
		if(strings[i].length()<strings[indMin].length()) {
			indMin=i;
		}else if(strings[i].length()> strings[indMax].length()) {
			indMax=i;
		}
	}
	System.out.println( strings[indMin]);
	System.out.println( strings[indMax]);
	System.out.println( strings[indMin].length());
	System.out.println( strings[indMax].length());
	return strings;
	}
}


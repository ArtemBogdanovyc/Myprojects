package Chapters.chapter02.tasks.task4;

import java.util.Arrays;
import java.util.Scanner;

public class FindString {
	private int quantity;
	private int quantity1=0;
	private String[] strings;
	private int newQuant;
	private  String newStr;
	//private String result;
	Scanner scan;
	private char [] strToArrayChar;
	public FindString(int quantity) {
		this.quantity=quantity;
		strings= new String[quantity];
		scan=new Scanner(System.in);
		for(int i=0; i<strings.length;i++) {
			strings[i]=scan.next();
			}
	}

	public int getDiffWord(String str ) {
		quantity1=0;
		char[] strToArrayChar=str.toCharArray();
		for(int j=1 ; j<strToArrayChar.length;j++) {
			//for(int k=j+1; k<strToArrayChar.length; k++) {
			if(strToArrayChar[0]!=(strToArrayChar[j])) {
				quantity1++;
			}
//}
}		
	return quantity1;	
	}		
	public void getShortString() {
		//for(int z =0; z<strings.length; z ++ ) {
		String result= strings[0];
			for(int k=1; k<strings.length;k++)		{	
			if(getDiffWord(result)>getDiffWord(strings[k])) {
			result=strings[k];
			}
			
			System.out.println(result+"("+getDiffWord(result)+")");
			}
		}
		
			
	}
	//}
	
					
			
			
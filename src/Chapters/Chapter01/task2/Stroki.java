package Chapters.Chapter01.task2;

import java.util.Arrays;

public class Stroki {
private int n;
private String [] masivStrok;
public Stroki(int n){
	this.n=n;
	masivStrok= new String[n];
}
public void getStringsInLine() {
	for(int i=0; i<masivStrok.length; i++)
	System.out.println(masivStrok[i]);
}
public void getStringsInColum() {
	for ( int i=0; i<masivStrok.length;i++)
	System.out.print(masivStrok[i]);
}
}

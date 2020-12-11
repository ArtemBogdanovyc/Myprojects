package Chapters.chapter02.tasks.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLatinWords {
private int quantity;
private String[] strings;
char[] latinLaters; 
Scanner scan;
Pattern latinPattern;
Matcher latinMatcher;
public FindLatinWords() {
    scan= new Scanner(System.in);
	latinPattern= Pattern.compile("[a-z]+");
	
}
public void findLatin(int quantity) {
	strings= new String[quantity];
	for(int i=0; i<strings.length;i++) {
		strings[i]=scan.next();
	}
	List<String> latinWords =new ArrayList<String>();;
	for(int j=0;j<strings.length;j++) {
		latinMatcher=latinPattern.matcher(strings[j].toLowerCase());
		if(latinMatcher.matches()) {
			latinWords.add(strings[j]);
		}
	}
	int vowelsCount;
	int consonantsCount;
	for(String latin: latinWords) {
		vowelsCount=latin.replaceAll("[^aeiou]", "").length();
		consonantsCount=latin.replaceAll("[aeiou]", "").length();
		if(vowelsCount==consonantsCount) {
	    System.out.print(latin+"(" +vowelsCount + ","+consonantsCount+ ")");
	     
		}
	}
	
}
}

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
private List<String> latinWords;
char[] latinLaters; 
Scanner scan;
Pattern latinPattern;
Matcher latinMatcher;
public FindLatinWords(int quantity) {
    strings= new String[quantity];
	latinWords= new ArrayList<String>();
	scan= new Scanner(System.in);
	latinPattern= Pattern.compile("[a-z]+");
	for(int i=0; i<strings.length;i++) {
		strings[i]=scan.next();
	}
}
public List<String> findLatin(String[] str) {
	for(int i=0;i<str.length;i++) {
		latinMatcher=latinPattern.matcher(str[i].toLowerCase());
		if(latinMatcher.matches()) {
			latinWords.add(str[i]);
		}
	}
	return latinWords;
}
public void findWords() {
	List<String>wordsInLatin=findLatin(strings);
int vowelsCount;
	int consonantsCount;
	for(String latin: wordsInLatin) {
		vowelsCount=latin.replaceAll("[^aeiou]", "").length();
		consonantsCount=latin.replaceAll("[aeiou]", "").length();
		if(vowelsCount==consonantsCount) {
	    System.out.print(latin+"(" +vowelsCount + ","+consonantsCount+ ")");
	     
		}
	}
}
}

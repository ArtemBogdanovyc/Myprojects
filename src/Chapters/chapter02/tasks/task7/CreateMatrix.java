package Chapters.chapter02.tasks.task7;

public class CreateMatrix {
private int count=1;

public void getMatrix() {
	for(int i=0; i<5 ;i++) {
		for(int j=0 ; j<5;j++) {
		  System.out.printf("%3s",count++);
		  
		}
		System.out.println();
	}
}
}

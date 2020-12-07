package Chapters.Chapter01.task5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTakeTask {
	private Calendar celendar;
	private String name;
	private String secondName;
	private Date dateTakeTask;
	private Date dateEndTask;
	
public DateTakeTask(String name,String secondName) {
	celendar= new GregorianCalendar(2020,0,19);
	this.name=name;
	this.secondName=secondName;
	
}
public void getTask() {
	celendar.set(Calendar.HOUR_OF_DAY,13);
	celendar.set(Calendar.MINUTE,00);
	celendar.set(Calendar.SECOND,35);
	dateTakeTask=celendar.getTime();
	System.out.println(name+secondName);
	System.out.println("Take Task:"+ dateTakeTask);
	celendar.add(Calendar.MONTH,+2);
	dateEndTask=celendar.getTime();
	System.out.println("End Task:"+ dateEndTask);
}
}

package uti;

import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

public class Time {
	private int hour, minutes, seconds;

	private Calendar calendar = Calendar.getInstance();
	
	private void setData() {
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minutes = calendar.get(Calendar.MINUTE);
		this.seconds = calendar.get(Calendar.SECOND);
	}
	
	public Time() {
		this.setData();
	} 
	
	public Time(long n) {
		this.calendar.setTime(new Date(n));
		this.setData();
	}
	
	public Time(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void setTime(long n) {
		this.calendar.setTime(new Date(n));
		this.setData();
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public int getSeconds() {
		return this.seconds;
	}
}

package com.ts.assignment;
//program on current time in GMT
public class Calculation3 {
	public static void main(String[] args) {
		long timezonechange=256;
		long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timezonechange) % 24);
         System.out.println("current time is " +currentHour +":" +currentMinute +":" +currentSecond);


	}

}

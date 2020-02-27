/**
 * CS 110 Section 12
 * Lab 7
 */

public class Clock {

	
//Creates private fields for hours, minutes and seconds
private int hours=0;
private int minutes=0;
private int seconds=0;


//Default Constructor resets all values to zero
	Clock()
	{
		hours =0;
		minutes=0;
		seconds=0;
	}//clock default constructor

	
//Parameterized Constructor
	Clock(int hrs, int min, int sec){
		setTime(hrs,min, sec);
	}//Parameterized Clock

	
//Creates copy constructor which duplicates the instance of Clock
	Clock(Clock copy){
		hours=copy.hours;
		minutes=copy.minutes;
		seconds=copy.minutes;
	}//Copy constructor

	
//Sets the time of the clock using if && else statements
	public void setTime(int hrs, int min, int sec) {
		
		if (0<=hrs && hrs<24 ) {
			 hours= hrs;
		}//if for the hours
		else {
			hours =0;
		}//else for the hours
		
		if (0<=min&& min<60) {
			minutes= min;
		}//if for the minutes
		else {
			minutes=0;
		}//else for the minutes
		
		if (0<=sec && sec<60) {
			seconds= sec;
		}//if for the seconds
		else {
			seconds=0;
		}//else
}//setTime	


//Method to return the hours
	public int getHours() {
		return hours;
	}//getHours
	

//Method to return the minutes
	public int getMinutes() {
		return minutes;
	}//getMinutes
	
	
//Method to return the seconds	
	public int getSeconds() {
		return seconds;
	}//getSeconds


//Prints the time
	public void printTime() {
		System.out.println(hours+":"+minutes+":"+seconds);
	}//prints the time
	

//Increments seconds by 1 and if it is 
//greater or equal it calls increment minutes
	public void incrementSeconds() {
		seconds++;
		
		if(seconds>=60) {
			seconds=0;
			
			incrementMinutes();
		}//if
	}//incrementSeconds
	
	
//Increments minutes by 1 and if it is
//greater or equal it calls incremnt hours
	public void incrementMinutes() {
		minutes++;
		
		if(minutes>=60) {
			minutes=0;
			
			incrementHours();
		}//if
	}//incrementMinutes
	
	
//Increments hours by 1 and if it is greater it resets
	public void incrementHours() {
		hours++;
		
		if(hours>=24) {
			hours=0;
		}//if
	}//incrementHours
	
	
//incrementSecondsBy
	public void incrementSecondsBy(int secondsV) {
		seconds= seconds+secondsV;
		if(seconds>60) {
			seconds=seconds % 60;
			minutes++;
		}//if
	}//incrementHoursBy
	
	
//incremetMinutesBy
	public void incremetMinutesBy(int minutesV) {
		minutes =minutes+minutesV;
		if(minutes>60) {
			minutes=minutes % 60;
			hours++;
		}//if
	}
	
	
//incrementHoursBy
	public void incrementHoursBy(int hoursV) {
		hours=hours+hoursV;
		if(hours>24){
			hours=hours%24;
		}//if
	}
	
	
//equals
	public boolean equals(Clock otherClock) {
		boolean T_F= false;
		
		if (hours == otherClock.hours && minutes == otherClock.minutes 
				&& seconds == otherClock.seconds){
			T_F = true;
		
		}
		return T_F;
	}
	

}//class

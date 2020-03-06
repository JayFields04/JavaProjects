/** 
 * CS 111 Section 2
 * Lab Assignment 3
 * Jaquez Fields
 */
public class Clock {
	
	private int hours;
	private int minutes;
	
//default constructor that sets hrs and min to 0(midnight)		
	public Clock(){
		hours= 0;
		minutes=0;
		
	}//Clock
	
//parameterized constructor that takes value for hours and minutes
		public Clock(int hours_in, int mins_in){
			hours= hours_in;
			minutes= mins_in;
		
	}//Clock
		
//getters for hours		
		public int getHours(){
			return hours;
			
		}//getHours

//getters for minutes
		public int getMinutes(){
			return minutes;
		}//getMinutes
		
//return the current time of 24hr clock to a 12hr a clock
		public String toString(){

			
			if (hours<=12){
				return hours+ ":"+ minutes+ " a.m";
				}//if
			else {
				return (hours-12)+":"+minutes+" p.m";
			}//else			
		}//toString
		
//Compare if times are equal to each other and returns true or false
		public boolean equals(Object a){
			if(a instanceof Clock && ((Clock)a).getMinutes()==minutes &&
					((Clock)a).getHours()==hours) {
				return true;
			}//if
			
			else {
				return false;
			}//else 
		}//equals
		
//Compares time of you and your friend		
		public int compareTo(Object a){
			int hrs= ((Clock) a).getHours();
			int min= ((Clock)a).getMinutes();
			
			if(a.equals(this)) {
				return 0;
			}//if
			else if(hours>hrs||(hours==hrs&& minutes>min)) {
				return 1;
			}//else if
			else {
				return -1;
			}//else
			
		}//compareTo
		
}//class

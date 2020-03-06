/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */
public abstract class Media  {
	
	private String title;
	private Artist majorArtist;
	private int hours, minutes,seconds;
	private int numPlays;
	
	
	//Parameterized COonstructor
	public Media(String title, Artist art) {
		this.title=title;
		this.majorArtist=art;
		
	}
	
	public void playMeia() {
		
	}

	//Setter for PlayTime
	public void setPlayTime(int h, int m, int s) {
		hours=h;
		minutes=m;
		seconds=s;
	}
	
	//Getter for Number of Plays
	public int getNumPlays() {
		return numPlays;
	}
	
	//Getter for Title	
	public String getTitle() {
		return this.title;
	}

	//Getter for Playing Time
	public String getPlayingTime() {
		return hours+":"+minutes+":"+seconds;
	}
	
	//Getter for Major Artist
	public Artist getMajorArtist() {
		return this.majorArtist;
	}
	
	//toString
	public String toString() {
		return "Title:"+ title+ "| MajorArtist:"+ majorArtist.toString()+ " |NumberPlays:"+ numPlays+ " |PlayingTime:"+ getPlayingTime();
	}
	
	
}//class
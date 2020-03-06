/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public class Artist {
	
	private String firstName;
	private String lastName;
	private String birthDate;
	private String twitterHandle; 
	private String url;
	
	
	public Artist(String first,String last,String dob,String twitter,String url) {
		this.firstName= first;
		this.lastName= last;
		this.birthDate=dob;
		this.twitterHandle= twitter;
		this.url= url;		
	}
	
	//getter for first name
	public String getFirst() {
		return this.firstName;
	}
	
	//getter for lastname
	public String getLast() {
		return this.lastName;
	}
	
	//getter for DOB
	public String getDOB() {
		return this.birthDate;
	}
	
	//Getter for twitter handle
	public String getTwitter() {
		return this.twitterHandle;
	}
	
	//Getter for URL
	public String getURl() {
		return this.url;
	}
	
	@Override
	public String toString() {
		return "Artist[ First:"+ firstName+ " | Last:"+lastName+ " | DOB:"+ birthDate
				+ " |TwitterHandle:"+twitterHandle+" |URL:"+ url +"]";
	}
	
}//Artist

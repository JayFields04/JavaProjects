/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public abstract class Video extends Media {
	
	private Artist supportingActors[];
	private int numActors;
	private Artist director;
	private int rating;
	
	//Parameterized Constructor
	public Video(String title, Artist major, Artist director) {
		super(title,major);
		this.director=director;
	}
	
	//setter for rating
	public void setRaiting(int rating) {
		this.rating=rating;
	}
	
	//getter for rating
	public int getRating() {
		return rating;
	}
	
	//setter for supporting actors
	public void setActors(Artist actors[]) {
		supportingActors=actors;
		numActors=actors.length;
	}
	
	//getter for supporting actors
	public Artist getSupportingActor(int i) {
		return supportingActors[i];
	}
	
	//play media
	public void playMedia() {
		
	}
	
	@Override
	public String toString() {
		return "Video["+ super.toString()+ " |SupportingActors:"+ supportingActors+ " |NumberOfActors"+ numActors
				+ " |Director:"+ director + " |Rating:"+ rating+ "]w";
	}
	
}//Video

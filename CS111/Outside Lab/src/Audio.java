/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public abstract class Audio extends Media{
	
	private Artist groupMember [];
	private int numMembers;
	private Artist producer;
	private int numPlays;
	
	//Parameterized Constructor
	public Audio(String title, Artist major, Artist producor) {
		super(title,major);
		this.producer= producer;
	}
	
	//getter for producer
	public Artist getProducer() {
		return this.producer;
	}
	
	//getter for members
	public void setMembers(Artist group[]) {
		groupMember=group;
		numMembers=group.length;
	}
	
	//getter for number of members
	public int getNumMembers() {
		return numMembers;
	}
	
	//plays media
	public void playMedia() {
		System.out.println("Currently playing"+ getTitle()+ " |PlayTime:"+ getPlayingTime());
		numPlays++;
	}//playMedia
	
	@Override
	public String toString() {
		return "Audio["+ super.toString()+ " |GroupMembers:"+ groupMember+ " |NumOfMembers:"+ numMembers+ " |Producer:"+ producer+"]";
	}
	
}//Audio

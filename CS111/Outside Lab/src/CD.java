/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public class CD extends Audio {
	
	private String tracks[];
	private int numTracks;
	
	public CD(String title,Artist artist, Artist producer) {
		super(title, artist, producer);
	}
	
	//sets track
	public void setTrack(String t[]) {
		tracks=t;
		numTracks=t.length;
	}
	
	//playmedia
	public void playMedia() {
		super.playMedia();
			for(int i=0;i<numTracks;i++) {
				System.out.println("Playing"+ tracks[i]);
			}
	}

	@Override
	public String toString() {
		return "CD["+ super.toString()+ " |Tracks:"+ tracks+ " |NumberOfTracks:"+ numTracks+ "]";
	}
}

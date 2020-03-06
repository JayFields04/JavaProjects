/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public class DVD extends Video {
	
	private String specialFeatures[];
	private int numFeatures;
	private String wideScreenFormat;
	private String TVFormat;
	private String soundOptions [];
	private int numSoundOptions;
	
	
	public DVD(String title, Artist major, Artist director) {
		super(title, major, director);
		
	}
	
	//sets special featutes
	public void setSpecial(String[]specialFeatures) {
		this.specialFeatures=specialFeatures;
		
		numFeatures= specialFeatures.length;
	}
	
	//gets special features
	public String[] getSpecialFeature() {
		return specialFeatures;
	}
	
	//gets number of features
	public int getNumFeatures() {
		return numFeatures;
	}
	
	//sets tv format
	public void setTVFormat(String tFormat) {
		TVFormat=tFormat;
	}
	
	//gets tc format
	public String getTVFormat() {
		return TVFormat;
	}
	
	//sets wideScteen format
	public void setWideScreenFormat(String wideScreenF) {
		this.wideScreenFormat= wideScreenF;
	}
	
	//gets wide screen format
	public String getWideSceenFormat() {
		return wideScreenFormat;
	}
	
	//sets Sound options
	public void setSoundOptions(String[] soundOptions) {
	       this.soundOptions = soundOptions;
	       this.numSoundOptions=soundOptions.length;
	   }

	//gets number of sound options
	public int getNumOptions() {
		return numSoundOptions;
	}
	

	@Override
	public String toString() {
		return "DVD["+super.toString()+ " |Special Features:"+ specialFeatures+ " |numOfFeatures:"+ numFeatures
				+ " |WideScreenFormat:"+ wideScreenFormat+ " |TVFormat:"+ TVFormat+ "]";
	}
}

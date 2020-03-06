/** 
 * CS 111 Section 2
 * Outside of Lab 1
 * Jaquez Fields
 */

public class MediaApp {

	public static void main(String[]args) {
	       Artist artist=new Artist("Michael","Jackson", "4/2/67", "@MJ", "MJ.com");
	       
	       //System.out.println(artist.toString());
	       
	       CD cd=new CD("Hi", artist, artist);
	       cd.setPlayTime(0, 42, 18);
	       cd.setTrack(new String[]{"Beat it","Thriller"});
	       
	       System.out.println(cd.toString());
	       
	       artist=new Artist("Chris","Evans", "5/13/88", "@CE", "CE.org"); 
	       artist=new Artist("Scarlett","Johansson", "10/3/87", "@SJ", "JC.net");
	       
	       DVD dvd=new DVD("Captin America", artist, artist);
	       dvd.setPlayTime(2, 27, 0);
	       Artist support[]=new Artist[2];
	       
	       System.out.println(dvd.toString());
	      


	      // System.out.println(artist.toString());
	       

 
	}//main
}//class

/**
 * CS 110 Section 12
 * Project 3
 */
import java.awt.Color;
public class Rectangle {
		
		private double halfLength;
		private double halfWidth; 
		private Color color;
		private double midX, midY;
	
	public Rectangle (double inputX, double inputY, double halfWidth, double halfLength, Color color) {
		this.midX= inputX;
		this.midY= inputY;
		this.halfLength= halfLength;
		this.halfWidth= halfWidth; 
		this.color= color;
		
	}
//Draws the rectangle
	public void draw(){
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(midX, midY, halfWidth, halfLength);
				
	}
//Method that sets new color
	public void setColor(Color newColor) {
		
	}
	
////Method that sets new cwidth
	public void setWidth(double newWidth) {
		
	}
	
//Method that sets new length
	public void setLength(double newLength) {
		
	}
}//class
		



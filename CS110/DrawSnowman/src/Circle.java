/**
 * CS 110 Section 12
 * Project 3
 */
import java.awt.*;
public class Circle {

		private double radius;
		private Color color;
		private double xPosition, yPosition;
		
	 Circle(double inputX, double inputY, double radius, Color color) {
			this.xPosition= inputX;
			this.yPosition= inputY;
			this.radius= radius;
			this.color= color;
		}

//Draws the circle
		public void draw(){
			StdDraw.setPenColor(color);
			StdDraw.filledCircle(xPosition, yPosition, radius);
		}
//Method that changes the color of the circle	
		public void setColor(Color newColor) {
			
		}
		
//Method that receives values for the radius
		public void setRadius(double radius) {
			
		}
	
}//class

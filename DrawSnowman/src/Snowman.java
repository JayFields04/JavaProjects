/**
 * CS 110 Section 12
 * Project 3
 */
import java.awt.Color;
public class Snowman {

	private Circle bottom;
	private Circle middle;
	private Circle head;
	private Rectangle hat;
	private Circle leftEye;
	private Circle rightEye;
	private Rectangle mouth;
	private Rectangle Arms;
	private Circle fistL;
	private Circle fistR;
	private Rectangle topHat;
	private Circle button1;
	private Circle button2;
	private Circle button3;



	public Snowman(Color botomColor, Color middleColor, Color headColor, Color hatColor, Color leftEyeColor,
			Color rightEyeColor, Color mouthColor, Color ArmsColor, Color fistLColor, Color fistRColor,
			Color topHatColor,Color button1Color, Color button2Color, Color button3Color){

		bottom= new Circle(150, 50, 55, botomColor);
		middle= new Circle(150, 130, 42, middleColor);
		head= new Circle(150, 185, 35, headColor);
		hat= new Rectangle(150, 220, 30, 12, hatColor);
		leftEye= new Circle(140, 195, 6, leftEyeColor);
		rightEye= new Circle(160, 195, 6, rightEyeColor);
		mouth= new Rectangle(150, 175, 10, 5, mouthColor);
		Arms= new Rectangle (150, 130, 95, 5, ArmsColor);
		fistL= new Circle (55, 130, 8, fistLColor);
		fistR= new Circle (250, 130, 8, fistRColor);
		topHat= new Rectangle (150, 240, 15, 10, topHatColor);
		button1= new Circle (150, 111, 6, button1Color);
		button2= new Circle (150, 128, 6, button2Color);
		button3= new Circle (150, 142, 6, button3Color);

	}	
	public void draw(){

		bottom.draw();
		middle.draw();
		head.draw();
		hat.draw();
		leftEye.draw();
		rightEye.draw();
		mouth.draw();
		Arms.draw();
		fistL.draw();
		fistR.draw();
		topHat.draw();
		button1.draw();
		button2.draw();
		button3.draw();

	}


}

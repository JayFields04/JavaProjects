/**
 * CS 110 Section 12
 * Project 3
 */

//This project needs StdDraw.jar or stdlib.jar
import java.awt.Color;


public class BuildSnowman {
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(0, 300);
		StdDraw.setYscale(0, 300);
		
		Color bottomColor, middleColor, headColor, hatColor, leftEyeColor, rightEyeColor, mouthColor, ArmsColor, fistLColor,
		fistRColor, topHatColor, button1Color, button2Color, button3Color;
		bottomColor= new Color(245, 0, 255);
		middleColor= new Color(150, 150, 150);
		headColor= new Color(29, 222, 136);
		hatColor= new Color(0, 0, 0);
		leftEyeColor= new Color(255, 255, 255);
		rightEyeColor= new Color(0, 0, 0);
		mouthColor= new Color(255, 0, 0);
		ArmsColor= new Color(150, 150, 150);
		fistLColor= new Color(150, 150, 150);
		fistRColor= new Color(150, 150, 150);
		topHatColor= new Color(0, 0, 0);
		button1Color= new Color(255, 255, 255);
		button2Color= new Color(0, 0, 0);
		button3Color= new Color(255, 255, 255);
		
		
		Snowman pic; 
		pic= new Snowman(bottomColor, middleColor, headColor, hatColor, leftEyeColor, rightEyeColor, mouthColor,
				ArmsColor, fistLColor, fistRColor,topHatColor, 
				button1Color, button2Color, button3Color);
		pic.draw();
	
	}
	
}
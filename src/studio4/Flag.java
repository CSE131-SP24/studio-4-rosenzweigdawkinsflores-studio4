package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {


		StdDraw.clear();
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5,0.5,0.5,0.25);
		StdDraw.setPenColor(244,141,16);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.25);

		StdDraw.setPenColor(140,166,207);
		StdDraw.filledRectangle(0.5,0.5,0.1, 0.03);
		StdDraw.filledRectangle(0.5,0.5,0.03, 0.1);
		StdDraw.filledRectangle(0.5, 0.7, 0.5, 0.01 );
		StdDraw.filledRectangle(0.5, 0.3, 0.5, 0.01 );
		StdDraw.circle(0.5, 0.5, 0.15);




	}
}
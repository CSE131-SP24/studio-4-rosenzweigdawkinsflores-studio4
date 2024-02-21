package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		 {
//				String shape = in.next();
//				int red = in.nextInt(); 
//				int green = in.nextInt();
//				int blue = in.nextInt();
//				boolean filled = in.nextBoolean();
//				double one = in.nextDouble();
//				double two = in.nextDouble();
//				double three = in.nextDouble();
//				double four = in.nextDouble();
//				StdDraw.setPenColor(red,green,blue);
//				StdDraw.filledRectangle(one, two, three, four);
//			
//		 
			
			 
			}
	
	}
}
	

StdDraw.clear();
StdDraw.setPenColor(0,0,0);
StdDraw.rectangle(0,0,3,6);
StdDraw.setPenColor(244,141,16);
StdDraw.filledRectangle(0,0,3,6);

StdDraw.setPenColor(140,166,207);
StdDraw.filledRectangle(-3, 2.5, 0.25, 6);

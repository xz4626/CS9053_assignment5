import java.io.*;
import java.util.ArrayList;

import shapes.*;

/* your tasks:
 * create a class called ShapeException
 * createShape should throw a ShapeException
 * in main(), you should catch the ShapeException
 * 
 */
public class ReadShapeFile {

	public static GeometricObject createShape(String shape) {
		
		/* if vehicleName is "Circle" return Circle();
		 * if vehicleName is "Rectangle" return Rectangle();
		 * if vehicleName is "Square" return Square();
		 * if it is not any one of these, it should throw
		 * a ShapeException
		 */
		return null;
	}
	
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
		File f = new File("shapes.txt");
		
		String inString = null;
		
		/* create a loop to read the file line-by-line */
		
		try {
			
			GeometricObject shape = createShape(inString);
		} catch (/* your exception */ ) {
			System.err.println("Cannot create Shape: " + inString);
		}

		System.out.println(shapeList);
		
	}
}

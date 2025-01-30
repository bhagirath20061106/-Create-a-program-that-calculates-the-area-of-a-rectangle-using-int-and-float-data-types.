import java.util.*;
public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter area and perimeter");
		Scanner num= new Scanner(System.in);
		int length= num.nextInt();
		int breadth= num.nextInt();
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("Area of Rectangle is: "+area+" Perimeter of Rectangle is: "+perimeter);
		
	}

}

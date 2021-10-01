import java.util.Scanner;

public class QuadrilateralMain 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4,height;
		System.out.println("Enter  x-y Co-ordinate of Trapezoid separated by space: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		System.out.print("Enter Height of a Trapezoid: ");
		height = input.nextDouble();
		Trapezoid t = new Trapezoid(x1,y1,x2,y2,x3,y3,x4,y4,height);
		t.area();
		System.out.printf("%s",t);
		System.out.println();
		System.out.println("Enter  x-y Co-ordinate of Parallelogram separated by space: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		System.out.print("Enter Height of a Parallelogram: ");
		height = input.nextDouble();
		Parallelogram p = new Parallelogram(x1,y1,x2,y2,x3,y3,x4,y4,height);
		p.area();
		System.out.printf("%s",p);
		System.out.println();
		System.out.println("Enter  x-y Co-ordinate of Square separated by space: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		Square s = new Square(x1,y1,x2,y2,x3,y3,x4,y4);
		s.area();
		System.out.printf("%s",s);
		System.out.println();
		System.out.println("Enter  x-y Co-ordinate of Rectangle separated by space: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		Rectangle r = new Rectangle(x1,y1,x2,y2,x3,y3,x4,y4);
		r.area();
		System.out.printf("%s",r);
		System.out.println();
		input.close();
	}

}
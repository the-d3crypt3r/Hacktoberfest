public class Quadrilateral 
{
	private double x1, y1, x2, y2, x3, y3, x4, y4,area;
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}
	public double getX1()
	{
		return x1;
	}
	public double getX2()
	{
		return x2;
	}
	public double getX3()
	{
		return x3;
	}
	public double getX4()
	{
		return x4;
	}
	public double getY1()
	{
		return y1;
	}
	public double getY2()
	{
		return y2;
	}
	public double getY3()
	{
		return y3;
	}
	public double getY4()
	{
		return y4;
	}
	public void setArea(double area)
	{
		this.area = area;
	}
	@Override
	public String toString()
	{
		return String.format("%s(%s,%s): (%.2f,%.2f)%n%s(%s,%s): (%.2f,%.2f)%n%s(%s,%s): (%.2f,%.2f)"
						+ "%n%s(%s,%s): (%.2f,%.2f)%n%s: %.2f","A","x1","x2",x1,y1,"B","x2","y2",x2,y2,"C","x3","y3",x3,y3,"D","x4","y4",x4,y4,"Area",area);
	}
}

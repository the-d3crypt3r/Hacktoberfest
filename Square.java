public class Square extends Quadrilateral
{
	Square(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	public void area()
	{
		double d = Math.sqrt((getX1() - getX2())*(getX1() - getX2()) + (getY1() - getY2())*(getY1() - getY2()));
		setArea(d*d);
	}
	@Override
	public String toString()
	{
		return String.format("%s",super.toString());
	}
}

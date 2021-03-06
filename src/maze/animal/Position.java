package maze.animal;

public class Position 
{
	private double x;
	private double y;
	private double z;
	
	public Position()
	{
		setDirection(0,0,0);
	}
	
	public Position(double x ,double y,double z)
	{
		setDirection(x,y,z);
	}
	
	public void setDirection(double x,double y,double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getZ(){
		return z;
	}
	
}

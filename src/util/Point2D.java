package util;

public class Point2D{
	public final int x,y;
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object o) {
		return (o instanceof Point2D) && ((Point2D)o).x==x && ((Point2D)o).y==y;
	}
	
}
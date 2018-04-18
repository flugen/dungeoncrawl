package util;

import java.util.ArrayList;

public class bbox{
	public final int x,y,w,h;
	public bbox() {
		x=0;
		y=0;
		w=1;
		h=1;
	}
	public bbox(int x,int y,int w,int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	public static bbox makeBBox(ArrayList<Point2D> v) {
		if (v.isEmpty())
			return new bbox();
		int x = v.get(0).x;
		int y = v.get(0).y;
		int w = 1;
		int h = 1;
		for (Point2D p : v) {
			if(p.x<x)
				x=p.x;
			else if(p.x>x+w)
				w=p.x-x;
			if(p.y<y)
				y=p.y;
			else if(p.y>y+h)
				h=p.y-y;
		}
		return new bbox(x,y,w,h);
	}
	public boolean within(int x1,int y1) {
		return x<=x1&&x1<x+w&&y<=y1&&y1<y+h;
	}
	
	public boolean checkOverlap(bbox o) {
		int x1=o.x+o.w;
		int y1=o.y+o.h;
		return within(o.x,o.y)||within(x1,o.y)||within(o.x,y1)||within(x1,y1);
	}
	
}
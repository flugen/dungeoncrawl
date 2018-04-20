package dungeon.dungeonroom;

import java.util.ArrayList;
import java.util.HashMap;

import dungeon.Feature;
import dungeon.Tile;
import util.Point2D;
import util.bbox;

public abstract class DungeonRoom {
	
	protected boolean artificial;
	protected ArrayList<Point2D> walls;
	protected bbox box;
	protected Tile[][] room;
	protected HashMap<Point2D, Feature> features;
//	protected
	
	public DungeonRoom(ArrayList<Point2D> w){
		box = bbox.makeBBox(w);
		room = new Tile[box.w][box.h];
		features = new HashMap<>();
	}
	
	protected void makeFloor() {
		
		
	}
	
	public abstract void addMajorItem();
	public abstract void addMinorItem();
	public abstract void addMajorFeature();
	public abstract void addMinorFeature();
	
	public Tile[][] getTiles(){
		return room.clone();
	}
	
	public bbox getBox() {
		try {
			return (bbox)box.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return new bbox(box.x, box.y, box.w, box.h);
		}
	}
	
	public ArrayList<Point2D> getWalls() {
		return walls;
	}

}

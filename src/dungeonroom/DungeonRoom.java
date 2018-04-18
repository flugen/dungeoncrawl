package dungeonroom;

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
	
	protected abstract void addMajorItem();
	protected abstract void addMinorItem();
	protected abstract void addMajorFeature();
	protected abstract void addMinorFeature();
	
	
	protected ArrayList<Point2D> getWalls() {
		return walls;
	}

}

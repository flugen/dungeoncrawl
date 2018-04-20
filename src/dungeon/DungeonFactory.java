package dungeon;


import static util.Dice.d8;
import static util.Dice.d20;
import static util.Dice.dN;

import java.util.ArrayList;

import dungeon.dungeonroom.ArtificialRoom;
import dungeon.dungeonroom.DungeonRoom;
import util.Point2D;
import util.bbox;

public class DungeonFactory {

	private enum roomType{
		natural,
		artificial,
		;
		public static final int numTypes=roomType.values().length;
		public static roomType valueOf(int x) {
			if (x<0||x>numTypes)
				return null;
			return roomType.values()[x];
		}
	}
	
	public static Dungeon createDungeon() {
		Dungeon d = new Dungeon();
		generateMajorRooms(d);
		generateMinorRooms(d);
		d.placeRooms();
		connectRooms(d);
		return d;
	}
	
	private static void generateMajorRooms(Dungeon d) {
		int numRooms = d8(2);
		roomType type;
		ArrayList<Point2D> walls;
		int ox,oy,size;
		DungeonRoom room;
		int count=0;
		for (int i = 0; i < numRooms; i++) {
			type = roomType.valueOf(dN(1,1));
			size = d20(2)/2+10;
			ox = dN(d.tiles[0].length);
			oy = dN(d.tiles.length);
			System.out.printf("x: %d y: %d size: %d\n",ox,oy,size);
			walls = makeWalls(type, ox, oy, size);
			if(d.checkOverlap(bbox.makeBBox(walls))&&count<5) {
				i=i-1;
				count++;
				continue;
			}
			count=0;
			switch(type) {
			default:
				room = new ArtificialRoom(walls);
				break;
			}
			int test=17;
			while(d20()>test) {
				room.addMajorItem();
				test = test+(20-test)/2;
			}
			test=10;
			while(d20()>test) {
				room.addMinorItem();
				test = test+(20-test)/2;
			}
			test=10;
			while(d20()>test) {
				room.addMajorFeature();
				test = test+(20-test)/2;
			}
			test=5;
			while(d20()>test) {
				room.addMinorFeature();
				test = test+(20-test)/2;
			}
			d.addRoom(room);
		}
	}
	
	
	private static void generateMinorRooms(Dungeon d) {
		
	}
	
	private static void connectRooms(Dungeon d) {
		
	}
	
	private static ArrayList<Point2D> makeWalls(roomType type,int ox,int oy,int size){
		ArrayList<Point2D> walls = new ArrayList<>();
		switch(type) {
		default:
			walls.add(new Point2D(ox-size/2, oy-size/2));
			walls.add(new Point2D(ox+size/2, oy-size/2));
			walls.add(new Point2D(ox-size/2, oy+size/2));
			walls.add(new Point2D(ox+size/2, oy+size/2));
			break;
		}
		return walls;
	}
	
}

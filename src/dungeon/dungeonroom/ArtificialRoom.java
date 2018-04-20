package dungeon.dungeonroom;

import java.util.ArrayList;

import dungeon.FeatureFactory;
import dungeon.Item;
import dungeon.Tile;
import util.Point2D;

import static util.Dice.d4;
import static util.Dice.dN;

/**
 * Methods for generating a constructed room - straight walls, 
 * @author mzr55
 *
 */
public class ArtificialRoom extends DungeonRoom {
	
	
	public ArtificialRoom(ArrayList<Point2D> w){
		super(w);
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (i==0 || i==room.length-1 || j==0 || j==room[i].length-1)
					room[i][j] = Tile.brick_wall;
				else
					room[i][j] = Tile.stone_floor;
			}
		}
		int numDoors=d4();
		int x=0,y=0;
		for (int i = 0; i < numDoors; i++) {
			switch(d4()) {
			case 1:
				x=0;
				y = dN(room[0].length-1);
				break;
			case 2:
				x=room[0].length-1;
				y = dN(room[0].length-1);
				break;
			case 3:
				y=0;
				x = dN(room[0].length-1);
				break;
			case 4:
				y=room[0].length-1;
				x = dN(room[0].length-1);
				break;
			}
			room[y][x] = Tile.door;
		}
		
	}

	@Override
	public void addMajorItem() {
		//TODO rework feature placement so it's less random 
		Item i=FeatureFactory.generateItem(true);
		i.location = new Point2D(dN(box.w-1), dN(box.h-1));
		features.put(i.location, i);
		room[i.location.x][i.location.y]=Tile.item;
	}

	@Override
	public void addMinorItem() {
		Item i=FeatureFactory.generateItem(false);
		i.location = new Point2D(dN(box.w-1), dN(box.h-1));
		features.put(i.location, i);
		room[i.location.x][i.location.y]=Tile.item;
		
	}

	@Override
	public void addMajorFeature() {
		//TODO rework feature placement so it's less random 
		Item i=FeatureFactory.generateItem(true);
		i.location = new Point2D(dN(box.w-1), dN(box.h-1));
		features.put(i.location, i);
		room[i.location.x][i.location.y]=Tile.feature;
		
	}

	@Override
	public void addMinorFeature() {
		Item i=FeatureFactory.generateItem(false);
		i.location = new Point2D(dN(box.w-1), dN(box.h-1));
		features.put(i.location, i);
		room[i.location.x][i.location.y]=Tile.feature;
		
	}

}

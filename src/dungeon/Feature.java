package dungeon;

import util.Point2D;

/**
 * All dungeon room features: items, furniture, etc.
 * @author mzr55
 *
 */
public class Feature {
	
	public boolean major;
	public String description;
	public String name;
	public Point2D location;
	
	public Feature() {
		this(false,null,null);
	}
	
	public Feature(boolean major,String name,String description) {
		this.major=major;
		this.name=name;
		this.description=description;
	}
	

	public String toString() {
		return name+" - "+description;
	}
	

}

package dungeon;

public class Item extends Feature{

	
	double gp;
	
	
	public Item(boolean major, String name, String description) {
		this(major,name,description,0.0);
	}
	
	public Item(boolean major, String name,String description, double gp) {
		super(major,name,description);
		this.gp=gp;
	}

	@Override
	public String toString() {
		return super.toString()+" worth "+gp+" GP";
	}
	
}

package dungeon;

public class Dungeon {
	
	private int width,height;
	private Tile[][] tiles;

	protected Dungeon() {
		this(500,200);
	}
	
	protected Dungeon(int w,int h) {
		width=w;
		height=h;
		tiles = new Tile[h][w];
		for (int i = 0; i < tiles.length; i++) {
			tiles[i] = new Tile[w];
			for (int j = 0; j < tiles[i].length; j++) {
				tiles[i][j] = Tile.space;
			}
		}
	}
	
	public boolean set(int x,int y,Tile t) {
		if(0<=x&&x<width&&0<=y&&y<height) {
			tiles[y][x] = t;
			return true;
		}else
			return false; 
	}
	
	public Tile replace(int x,int y,Tile t) {
		if(0<=x&&x<width&&0<=y&&y<height) {
			Tile t1 = tiles[y][x];
			tiles[y][x] = t;
			return t1;
		}else
			return null; 
	}
	
	public Tile get(int x,int y) {
		if(0>x||x>width||0>y||y>height)
			return null;
		return tiles[y][x];
	}

	public void print() {
		String s;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tiles.length; i++) {
			sb.delete(0, sb.length());
			for (int j = 0; j < tiles[i].length; j++) {
				sb.append(tiles[i][j].p);
			}
			s = sb.toString();
			System.out.println(s);
		}
	}
	
}

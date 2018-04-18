package dungeon;

public enum Tile{
	stone('#'),
	stone_floor('.'),
	dirt_floor(','),
	stone_wall('O'),
	brick_wall('B'),
	door('D'),
	entrance('E'),
	space('*'),
	item('I'),
	feature('F'),
	;
	public char p;
	private Tile(char pic) {
		p=pic;
	}
}

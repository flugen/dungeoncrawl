package dungeon;

public enum Tile{
	stone('#'),
	stone_floor('.'),
	dirt_floor(','),
	stone_wall('O'),
	brick_wall('B'),
	space('*')
	;
	public char p;
	private Tile(char pic) {
		p=pic;
	}
}

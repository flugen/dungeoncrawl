package dungeon;

public class DungeonFactory {

	public static Dungeon createDungeon() {
		Dungeon d = new Dungeon();
		generateMajorRooms(d);
		generateMinorRooms(d);
		connectRooms(d);
		return d;
	}
	
	private static void generateMajorRooms(Dungeon d) {
		
	}
	
	private static void generateMinorRooms(Dungeon d) {
		
	}
	
	private static void connectRooms(Dungeon d) {
		
	}
	
}

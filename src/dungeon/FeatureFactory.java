package dungeon;

public class FeatureFactory {
	
	public static Item generateItem(boolean major) {
		String name="sword",description="generic";
		if (major) {
			name = "Magic Sword";
		}else {
			
		}
		return new Item(major,name,description);
	}
	
	public static Feature generateFurniture() {
		String name="chair",description="a wooden chair";
		return new Feature(false, name, description);
	}
	
	public static Feature generateCaveFeature(boolean major) {
		String name="stalagmite",description="pointy stone bottom tooth";
		return new Feature(major, name, description);
	}

}

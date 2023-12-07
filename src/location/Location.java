package location;
import player.*;

public abstract class Location {
	public Player player;
	private String name;
	

	public Location() {}
	
	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}
	
	public abstract boolean onLocation();

	public abstract String info();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

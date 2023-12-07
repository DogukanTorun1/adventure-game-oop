package location;

import player.Player;

public abstract class NormalLocation extends Location {
	
	public NormalLocation(Player player, String name) {
		super(player, name);
	}

	public abstract String info();
	
	@Override
	public boolean onLocation() {
		return true;
		
	}
}

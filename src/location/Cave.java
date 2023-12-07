package location;
import obstacle.*;
import player.Player;

public class Cave extends BattleLocation {
	
	public Cave(Player player) {
		super(player,"Cave", new Zombie(),"rope",3);
	}

	public String info(){
		return "There are zombies in the cave! (Loot: Rope)";
	
	};

}

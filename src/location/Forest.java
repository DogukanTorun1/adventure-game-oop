package location;
import obstacle.*;
import player.Player;

public class Forest extends BattleLocation {
	
	public Forest(Player player) {
		super(player,"Forest",new Vampire(),"wood",3);
	}
	
	@Override
	public String info(){
		return "There are vampires in the forest! (Loot: Wood)";	
	}
}

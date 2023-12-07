package location;
import obstacle.*;
import player.*;

public class River extends BattleLocation {
	
	public River(Player player) {
		super(player,"River", new Bear(),"water",3);
	}

	@Override
	public String info(){
		return "There are bears in the river! (Loot: Water)";	
	}

}

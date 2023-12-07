package location;

import obstacle.Snake;
import player.Player;

public class Mine extends BattleLocation {

    public Mine(Player player) {
        super(player,"Mine",new Snake(),"stone", 5);
    }

    @Override
	public String info(){
		return "There are snakes in the mine! (Loot: Stone)";	
	}
}

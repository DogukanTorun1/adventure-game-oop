package game;
import player.*;
import location.*;
import java.util.*;
import characters.*;
import characters.Character;

public class Game {
	private final Scanner input;
	public Location location;
	public String name;
	public Player player;
	
	public Game() {
		this.input = new Scanner(System.in);
	}

	public void start() {
		System.out.println("Hello adventurer!");
		System.out.print("Please enter your the name: ");
		name = input.next();
		player = new Player(name);	
		System.out.println("-------------------------------------------------------------------");	
		System.out.println(player.getName()+ " welcome to the island!");
		System.out.println("If you want to escape you must build a bot!");
		System.out.println("To build a bot you must get the items from different locations!");
		System.out.println("But be careful! There are dangerous monsters everywhere!");
		System.out.println("-------------------------------------------------------------------");
	}
	
	
	public void selectChar() {
		Character[] characters = {new Assasin(), new Archer(), new Knight()};

		System.out.println("Choose a character you want: ");
		for(Character character : characters) {
			System.out.println("Press " + character.getId() + " for " + character.getName()
			+ "\tDamage:" + character.getDamage() + "\tHealth:" + character.getHealth() + "\tMoney:" + character.getMoney());
		}
		

		label:
		while (true) {
			int pickChar = input.nextInt();

			switch (pickChar) {
				case 1:
					player.setId(characters[0].getId());
					player.setDamage(characters[0].getDamage());
					player.setHealth(characters[0].getHealth());
					player.setMoney(characters[0].getMoney());
					break label;
				case 2:
					player.setId(characters[1].getId());
					player.setDamage(characters[1].getDamage());
					player.setHealth(characters[1].getHealth());
					player.setMoney(characters[1].getMoney());
					break label;
				case 3:
					player.setId(characters[2].getId());
					player.setDamage(characters[2].getDamage());
					player.setHealth(characters[2].getHealth());
					player.setMoney(characters[2].getMoney());
					break label;
				default:
					System.out.print("You entered the invalid number. Please try again:");
					break;
			}
		}
	}
	
	public void selectLocation() {
		Location[] locations = {new ToolStore(player, name), new SafeHouse(player, name), new Cave(player), new River(player), new Forest(player), new Mine(player)};
		int i=1;
		int locName;
		
		while(true) {
			System.out.println("Please choose the location you want to go:");
			i=1;

			for(Location location : locations) {
			System.out.println("Press "+ i + " for\t" + location.getName() + "\t" + location.info());	
			i++;
			}

			System.out.println("Press 0 for exit the Game!");

			locName = input.nextInt();

			switch (locName) {
				case 1 -> {
					locations[0].onLocation();
				}
				case 2 -> {
					locations[1].onLocation();
				}
				case 3 -> {
					if (!this.player.getInventory().isRope()) {
						locations[2].onLocation();
					} else {
						System.out.println("You can't go back the cave because you've won a prize before");
					}
				}
				case 4 -> {
					if (!this.player.getInventory().isWater()) {
						locations[3].onLocation();
					} else {
						System.out.println("You can't go back the river because you've won a prize before");
					}
				}
				case 5 -> {
					if (!this.player.getInventory().isWood()) {
						locations[4].onLocation();
					} else {
						System.out.println("You can't go back the forest because you've won a prize before");
					}
				}
				case 6 -> {
					locations[5].onLocation();
				}
				case 0 -> {
					System.out.println("Thank you for playing! \n Hope to see you again! \n\n\n");
					System.exit(0);
				}
				default -> {
					location = new SafeHouse(player, name);
					location.onLocation();
					System.out.println("Wrong location! You are in the safe house");
				}
			}

			System.out.println();

			}
		}
	}



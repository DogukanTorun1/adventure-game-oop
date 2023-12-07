package inventory;

public class Inventory {
	private boolean water;
	private  boolean rope;
	private boolean wood;
	private boolean stone;
	private String armorName;
	private String weaponName;
	private  int weaponDamage;
	private int armorDefence;

	public Inventory() {
		this.armorName = "none";
		this.weaponName = "punch" ;
		this.weaponDamage = 0 ;
		this.armorDefence = 0;
	}

	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean isRope() {
		return rope;
	}
	public void setRope(boolean rope) {
		this.rope = rope;
	}
	public boolean isWood() {
		return wood;
	}
	public void setWood(boolean wood) {
		this.wood = wood;
	}
	public boolean isStone() {
		return stone;
	}
	public void setStone(boolean stone) {
		this.stone = stone;
	}
	public String getArmorName() {
		return armorName;
	}
	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}
	public int getWeaponDamage() {
		return weaponDamage;
	}
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	public int getArmorDefence() {
		return armorDefence;
	}
	public void setArmorDefence(int armorDefence) {
		this.armorDefence = armorDefence;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
}

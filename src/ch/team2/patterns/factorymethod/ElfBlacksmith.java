package ch.team2.patterns.factorymethod;

public class ElfBlacksmith implements Blacksmith {

	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}
}

package ch.team2.patterns.factorymethod;

public class OrcBlacksmith implements Blacksmith {

	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}
}

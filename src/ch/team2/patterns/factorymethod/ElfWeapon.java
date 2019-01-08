package ch.team2.patterns.factorymethod;

public class ElfWeapon implements Weapon {

	private WeaponType weaponType;

	public ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}
}

package ch.team2.patterns.factorymethod;

public class OrcWeapon implements Weapon {

	private WeaponType weaponType;

	public OrcWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}
}
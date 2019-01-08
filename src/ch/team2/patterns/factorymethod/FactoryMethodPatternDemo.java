package ch.team2.patterns.factorymethod;

public class FactoryMethodPatternDemo {

		private final Blacksmith blacksmith;

		public FactoryMethodPatternDemo(Blacksmith blacksmith) {
			this.blacksmith = blacksmith;
		}

		public static void main(String[] args) {
			FactoryMethodPatternDemo app = new FactoryMethodPatternDemo(new OrcBlacksmith());
			app.manufactureWeapons();

			app = new FactoryMethodPatternDemo(new ElfBlacksmith());
			app.manufactureWeapons();
		}

		private void manufactureWeapons() {
			Weapon weapon;
			weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
			System.out.println(weapon.toString());
			weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
			System.out.println(weapon.toString());
		}
}

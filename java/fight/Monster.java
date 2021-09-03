package fight;

class Monster {
	private String name;
	private int HP;
	private int damage;
	
	public Monster() {
		name = "기본전사";
		HP=100;
		damage=10;
	}
	
	public Monster(String name, int HP, int damage) {
		this.name = name;
		this.HP = HP;
		this.damage=damage;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setHP(int inHP) {
		if(inHP<0) {
			this.HP=0;
		}
		else {
		this.HP=inHP;}
	}
	
	public String getname() {
		return name;
	}
	
	public void Attack(fight_warrior fwa) {
		fwa.setHP(fwa.getHP()-damage);
		System.out.printf("%s가 %s를 %d의 공격력으로 공격!\n", name, fwa.getname(), damage);
		System.out.printf("%s의 HP:%d\n", fwa.getname(),fwa.getHP());
	}

}

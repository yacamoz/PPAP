package fight;

class fight_warrior {
	private String name;
	private int HP;
	private int damage;
	
	public fight_warrior() {
		name = "기본전사";
		HP=100;
		damage=10;
	}
	
	public fight_warrior(String name, int HP, int damage) {
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
	public void Attack(Monster mon) {
		mon.setHP((mon.getHP()-damage));
		System.out.printf("%s가 %s를 %d의 공격력으로 공격!\n", name, mon.getname(), damage);
		System.out.printf("%s의 체력:%d\n", mon.getname(), mon.getHP());
	}

}

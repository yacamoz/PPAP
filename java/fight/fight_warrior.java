package fight;

class fight_warrior {
	private String name;
	private int HP;
	private int damage;
	
	public fight_warrior() {
		name = "�⺻����";
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
		System.out.printf("%s�� %s�� %d�� ���ݷ����� ����!\n", name, mon.getname(), damage);
		System.out.printf("%s�� ü��:%d\n", mon.getname(), mon.getHP());
	}

}

package Fight;

class Monster {
	private String name;
	private int HP;
	private int damage;
	
	public Monster() {
		name="기본몬스터";
		HP=100;
		damage=10;
	}
	public Monster(String name,int HP,int damage) {
		this.name=name;
		this.HP=HP;
		this.damage=damage;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP=HP;
	}
	public String getName() {
		return name;
	}
	
	public void Attack(Warrior war) {
		//war.hp=war.hp-damage;
		war.setHP(war.getHP()-damage);
		//전사의 현재 HP를 가져와서 몬스터 대미지만큼 뺀다음
		//그 값을
		//전사의 현재 HP로 세팅한다.
		//=>몬스터가 전사를 공격한다!
		System.out.printf("%s가%s를 공격! 대미지:%d\n",name,war.getName(),damage);
		System.out.printf("전사 HP:%d\n",war.getHP());
	}
}


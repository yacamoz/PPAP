package Fight;

class Monster {
	private String name;
	private int HP;
	private int damage;
	
	public Monster() {
		name="�⺻����";
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
		//������ ���� HP�� �����ͼ� ���� �������ŭ ������
		//�� ����
		//������ ���� HP�� �����Ѵ�.
		//=>���Ͱ� ���縦 �����Ѵ�!
		System.out.printf("%s��%s�� ����! �����:%d\n",name,war.getName(),damage);
		System.out.printf("���� HP:%d\n",war.getHP());
	}
}


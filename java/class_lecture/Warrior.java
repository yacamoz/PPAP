package Fight;

class Warrior {
	private String name;
	private int HP;
	private int damage;
	
	public Warrior() {
		name="�⺻����";
		HP=100;
		damage=10;
	}
	public Warrior(String name,int HP,int damage) {
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
	
	public void Attack(Monster mon) {
		//mon.hp=mon.hp-damage;
		mon.setHP(mon.getHP()-damage);//����
		//���� ���� HP�� �����ͼ� 
		//�� ���� ������ ������� ������
		//���� HP�� �����Ѵ�.
		System.out.printf("%s��%s�� ����! �����:%d\n",name,mon.getName(),damage);
		System.out.printf("���� HP:%d\n",mon.getHP());
	}
}

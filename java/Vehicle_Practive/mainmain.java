package Vehicle_Practive;

import java.util.Scanner;

public class mainmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle[] vhc=new Vehicle[5];
		int num, number;
		String id, name, provider;
		boolean navi;
		double price, load;
		while(true) {
			System.out.print("�޴�\n1.�����������\n2.���������˻�\n3.������������\n4.������������\n5.����");
			num=sc.nextInt();
			if(num==5) {
				break;
			}
		num=sc.nextInt();
		switch(num) {
		case 1: {
			for(int i=0;i<5;i++) {
			System.out.printf("� ������ ����Ͻ� �̴ϱ�?\n1.�Ϲ�����\n2.Ʈ��\n3.�������\n");
			num=sc.nextInt();
			switch(num) {
			case 1: {
				System.out.print("��� ���̵� �Է�:");
				id=sc.next();
				System.out.print("\n������ �Է�:");
				name=sc.next();
				System.out.print("\n������ �Է�:");
				provider=sc.next();
				System.out.print("\n���� �Է�:");
				price=sc.nextDouble();
				System.out.print("\n�׺���̼� ����(true/false):");
				navi=sc.nextBoolean();
				vhc[i]=new Car(id, name, provider, price, navi);
				break;
			}
			case 2:{
				System.out.print("��� ���̵� �Է�:");
				id=sc.next();
				System.out.print("\n������ �Է�:");
				name=sc.next();
				System.out.print("\n������ �Է�:");
				provider=sc.next();
				System.out.print("\n���� �Է�:");
				price=sc.nextDouble();
				System.out.print("\n�׺���̼� ����(true/false):");
				navi=sc.nextBoolean();
				System.out.print("\n���緮:");
				load=sc.nextDouble();
				vhc[i]=new truck(id, name, provider,price,navi,load);
				break;
			}
			case 3:{
				System.out.print("��� ���̵� �Է�:");
				id=sc.next();
				System.out.print("\n������ �Է�:");
				name=sc.next();
				System.out.print("\n������ �Է�:");
				provider=sc.next();
				System.out.print("\n���� �Է�:");
				price=sc.nextDouble();
				System.out.print("\n��ȣ��:");
				number=sc.nextInt();
				vhc[i]=new bycicle(id,name,provider,price,number);
				break;
			}
			}//case 1�� switch ����
			}//case 1�� for ����
		break;}//case1 ����
		case 2: {
			System.out.println("��ȸ�� ���� ���̵� �Է�:");
			id=sc.next();
			for(int i=0;i<5;i++) {
				if(vhc[i].getID().equals(id)) {
					vhc[i].introduce();
					break;
				}
				else if(i==4&&!vhc[4].getID().equals(id)) {
					System.out.println("������ �������� �ʽ��ϴ�");
					break;
				}
			}//case2 for ����
		break;}//case2 ����
		case 3: {
			System.out.println("�������̵� �Է�:");
			id=sc.next();
			for(int i=0;i<5;i++) {
			if(vhc[i].getID().equals(id)){
				System.out.println("���� ���̵� Ȯ��!\n������ ���� �Է�:");
				price=sc.nextDouble();
				vhc[i].upprice(price);
				break;
			}
			else if (i==4&&!vhc[4].getID().equals(id)) {
				System.out.println("������ �������� �ʽ��ϴ�");
				break;
			}
		}//case3 for end
		break;}//case3 end
		case 4: {
			System.out.println("������ ���� ���̵� �Է�:");
			id=sc.next();
			for(int i=0;i<5;i++) {
				if(vhc[i].getID().equals(id)) {
					vhc[i]=null;
					System.out.printf("%s���� �����Ϸ�!", id);
					break;
				}
				else if (i==4&&!vhc[4].getID().equals(id)) {
					System.out.println("������ �������� �ʽ��ϴ�");
					break;
				}
			}//case 4 for end
		break;}//case 4 end
		}//switch �� ����
		}//while �� ����
	}//���� ����
}
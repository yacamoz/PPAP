package serchprac;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		String serch;
		int num;
		Scanner sc = new Scanner(System.in);
		smartphone phone[]=new smartphone[20];
		phone[0]=new smartphone("������ 7","�Ｚ",32,"SKT",600,"ȭ��Ʈ");
		phone[1]=new smartphone("������ 7","�Ｚ",30,"LG U+",600,"���");
		phone[2]=new smartphone("������ 7","�Ｚ",31,"KT",600,"��");
		phone[3]=new smartphone("������ 8","�Ｚ",40,"SKT",500,"���");
		phone[4]=new smartphone("������ 8","�Ｚ",41,"SKT",600,"ȭ��Ʈ");
		phone[5]=new smartphone("������ 8","�Ｚ",42,"SKT",500,"���");
		phone[6]=new smartphone("G7","LG",25,"LG U+",650,"ȭ��Ʈ");
		phone[7]=new smartphone("G7","LG",24,"KT",650,"���");
		phone[8]=new smartphone("G8","LG",30,"LG U+",600,"�ǹ�");
		phone[9]=new smartphone("G8","LG",31,"sKT",600,"���");
		phone[10]=new smartphone("������12 pro","Apple",135,"SKT",600,"�ǹ�");
		phone[11]=new smartphone("������12","Apple",95,"SKT",600,"����");
		
		while(true) {
			System.out.print("1.�����ȸ\n2.�𵨸� ��ȸ\n3.������ ��ȸ\n4.���� ��ȸ\n5.���౸��\n6.����");
			num=sc.nextInt();
			if(num==6) {
				break;
			}
			switch(num) {
				case 1 : {
					for(int i = 0;i<20;i++) {
						if(phone[i]==null) {
							break;
						}
						phone[i].phoneinfo();
						System.out.printf("��ǰ�ѹ�%d��\n", i);
					}
				break;}//case1 end
				case 2: {
					System.out.print("�𵨸� �Է�:");
					serch=sc.next();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getname().contains(serch)) {
							phone[i].phoneinfo();
							System.out.printf("��ǰ�ѹ�%d��\n", i);
						}
					}
				break;}//case2end
				case 3: {
					System.out.print("������ �Է�");
					serch=sc.next();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getcom().equals(serch)) {
							phone[i].phoneinfo();
							System.out.printf("��ǰ�ѹ�%d��\n", i);
						}
					}
				break;}//case3 end
				case 4: {
					int num2;
					System.out.print("���۰���:");
					num=sc.nextInt();
					System.out.print("������:");
					num2=sc.nextInt();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getprice()<=num2&&phone[i].getprice()>=num) {
							phone[i].phoneinfo();
							System.out.printf("��ǰ�ѹ�%d��\n", i);
						}
					}
				break;}//case4 end
				case 5: {
					System.out.printf("��ǰ��ȣ �Է�:");
					int num2;
					num2=sc.nextInt();
					if(phone[num2].getrvt()==false) {
						System.out.println("���� �����մϴ�. �����Ͻðڽ��ϱ�?\n1.yes\n2.no");
						int num3;
						num3=sc.nextInt();
						if(num3==1) {
							phone[num2].setrvt(true);
							System.out.println("����Ϸ�");
						}
						else {break;}
					}
					else if (phone[num2].getrvt()==true) {
						System.out.print("�̹� ����Ǿ��ֽ��ϴ�\n");
						break;
					}
				}
			}//switch end
		
		}
	}

}

package serchprac;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		String serch;
		int num;
		Scanner sc = new Scanner(System.in);
		smartphone phone[]=new smartphone[20];
		phone[0]=new smartphone("갤럭시 7","삼성",32,"SKT",600,"화이트");
		phone[1]=new smartphone("갤럭시 7","삼성",30,"LG U+",600,"블루");
		phone[2]=new smartphone("갤럭시 7","삼성",31,"KT",600,"블랙");
		phone[3]=new smartphone("갤럭시 8","삼성",40,"SKT",500,"블루");
		phone[4]=new smartphone("갤럭시 8","삼성",41,"SKT",600,"화이트");
		phone[5]=new smartphone("갤럭시 8","삼성",42,"SKT",500,"블루");
		phone[6]=new smartphone("G7","LG",25,"LG U+",650,"화이트");
		phone[7]=new smartphone("G7","LG",24,"KT",650,"블루");
		phone[8]=new smartphone("G8","LG",30,"LG U+",600,"실버");
		phone[9]=new smartphone("G8","LG",31,"sKT",600,"골드");
		phone[10]=new smartphone("아이폰12 pro","Apple",135,"SKT",600,"실버");
		phone[11]=new smartphone("아이폰12","Apple",95,"SKT",600,"레드");
		
		while(true) {
			System.out.print("1.모두조회\n2.모델명 조회\n3.제조사 조회\n4.가격 조회\n5.예약구매\n6.종료");
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
						System.out.printf("제품넘버%d번\n", i);
					}
				break;}//case1 end
				case 2: {
					System.out.print("모델명 입력:");
					serch=sc.next();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getname().contains(serch)) {
							phone[i].phoneinfo();
							System.out.printf("제품넘버%d번\n", i);
						}
					}
				break;}//case2end
				case 3: {
					System.out.print("제조사 입력");
					serch=sc.next();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getcom().equals(serch)) {
							phone[i].phoneinfo();
							System.out.printf("제품넘버%d번\n", i);
						}
					}
				break;}//case3 end
				case 4: {
					int num2;
					System.out.print("시작가격:");
					num=sc.nextInt();
					System.out.print("끝가격:");
					num2=sc.nextInt();
					for(int i=0;i<20;i++)
					{
						if(phone[i]==null) {
							break;
						}
						else if (phone[i].getprice()<=num2&&phone[i].getprice()>=num) {
							phone[i].phoneinfo();
							System.out.printf("제품넘버%d번\n", i);
						}
					}
				break;}//case4 end
				case 5: {
					System.out.printf("제품번호 입력:");
					int num2;
					num2=sc.nextInt();
					if(phone[num2].getrvt()==false) {
						System.out.println("예약 가능합니다. 예약하시겠습니까?\n1.yes\n2.no");
						int num3;
						num3=sc.nextInt();
						if(num3==1) {
							phone[num2].setrvt(true);
							System.out.println("예약완료");
						}
						else {break;}
					}
					else if (phone[num2].getrvt()==true) {
						System.out.print("이미 예약되어있습니다\n");
						break;
					}
				}
			}//switch end
		
		}
	}

}

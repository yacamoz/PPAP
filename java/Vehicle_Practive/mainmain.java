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
			System.out.print("메뉴\n1.차량정보등록\n2.차량정보검색\n3.차량정보수정\n4.차량정보삭제\n5.종료");
			num=sc.nextInt();
			if(num==5) {
				break;
			}
		num=sc.nextInt();
		switch(num) {
		case 1: {
			for(int i=0;i<5;i++) {
			System.out.printf("어떤 차량을 등록하실 겁니까?\n1.일반차량\n2.트럭\n3.오토바이\n");
			num=sc.nextInt();
			switch(num) {
			case 1: {
				System.out.print("등록 아이디 입력:");
				id=sc.next();
				System.out.print("\n차량명 입력:");
				name=sc.next();
				System.out.print("\n제조사 입력:");
				provider=sc.next();
				System.out.print("\n가격 입력:");
				price=sc.nextDouble();
				System.out.print("\n네비게이션 여부(true/false):");
				navi=sc.nextBoolean();
				vhc[i]=new Car(id, name, provider, price, navi);
				break;
			}
			case 2:{
				System.out.print("등록 아이디 입력:");
				id=sc.next();
				System.out.print("\n차량명 입력:");
				name=sc.next();
				System.out.print("\n제조사 입력:");
				provider=sc.next();
				System.out.print("\n가격 입력:");
				price=sc.nextDouble();
				System.out.print("\n네비게이션 여부(true/false):");
				navi=sc.nextBoolean();
				System.out.print("\n적재량:");
				load=sc.nextDouble();
				vhc[i]=new truck(id, name, provider,price,navi,load);
				break;
			}
			case 3:{
				System.out.print("등록 아이디 입력:");
				id=sc.next();
				System.out.print("\n차량명 입력:");
				name=sc.next();
				System.out.print("\n제조사 입력:");
				provider=sc.next();
				System.out.print("\n가격 입력:");
				price=sc.nextDouble();
				System.out.print("\n번호판:");
				number=sc.nextInt();
				vhc[i]=new bycicle(id,name,provider,price,number);
				break;
			}
			}//case 1의 switch 구문
			}//case 1의 for 구문
		break;}//case1 종료
		case 2: {
			System.out.println("조회할 차량 아이디 입력:");
			id=sc.next();
			for(int i=0;i<5;i++) {
				if(vhc[i].getID().equals(id)) {
					vhc[i].introduce();
					break;
				}
				else if(i==4&&!vhc[4].getID().equals(id)) {
					System.out.println("정보가 존재하지 않습니다");
					break;
				}
			}//case2 for 구문
		break;}//case2 종료
		case 3: {
			System.out.println("차량아이디 입력:");
			id=sc.next();
			for(int i=0;i<5;i++) {
			if(vhc[i].getID().equals(id)){
				System.out.println("차량 아이디 확인!\n수정할 가격 입력:");
				price=sc.nextDouble();
				vhc[i].upprice(price);
				break;
			}
			else if (i==4&&!vhc[4].getID().equals(id)) {
				System.out.println("정보가 존재하지 않습니다");
				break;
			}
		}//case3 for end
		break;}//case3 end
		case 4: {
			System.out.println("삭제할 차량 아이디 입력:");
			id=sc.next();
			for(int i=0;i<5;i++) {
				if(vhc[i].getID().equals(id)) {
					vhc[i]=null;
					System.out.printf("%s차량 삭제완료!", id);
					break;
				}
				else if (i==4&&!vhc[4].getID().equals(id)) {
					System.out.println("정보가 존재하지 않습니다");
					break;
				}
			}//case 4 for end
		break;}//case 4 end
		}//switch 문 종료
		}//while 문 종료
	}//메인 종료
}
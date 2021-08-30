package ex01;
import java.util.Scanner;

class Account{
	Scanner sc = new Scanner(System.in);
	double balance;
	int acnum;
	int acpw;
	int nopi;
	int giri;
	
	Account(int nopi, int giri){
		this.nopi = nopi;
		this.giri=giri;
	}
	
	int trnulbi(int nopi, int giri) {
		int result = 0;
		result = nopi*giri/2;
		return result;
	}
	int sqnulbi(int nopi, int giri) {
		int result = 0;
		result = nopi*giri;
		return result;
	}
	
	Account(double balance, int acnum, int acpw){
	this.balance = balance;
	this.acnum = acnum;
	this.acpw = acpw;
	}
	
	void showinfo() {
		System.out.printf("잔액:%.2f\n", balance);
		System.out.printf("계좌번호:%d\n", acnum);
	}
	double deposit(double num1) {
		balance+=num1;
		System.out.printf("잔액:%.2f\n", balance);
		return balance;
	}
	double withdraw(double num2) {
		int innum;
		System.out.print("비밀번호를 입력하세요:");
		innum=sc.nextInt();
		if (innum!=acpw) {
			System.out.print("번호가 틀렸습니다");
			return balance;
		}
		else if (balance>num2) {
			balance-=num2;
			System.out.printf("잔액:%.2f", balance);
		return balance;}
		else {
			System.out.println("잔액이 부족합니다");
			return balance;
		}
	}
}

public class class_practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account(5000,11235,503);
		int num1 = 0;
		double num2 = 0;
		while(true) {
			System.out.println("메뉴를 선택하세요\n1.입금\n2.출급\n3.조회\n4.종료");
			num1=sc.nextInt();
			if (num1==4){
				break;}
				
			switch(num1) {
			case 1:
				System.out.println("얼마입금?");
				num2 = sc.nextDouble();
				a1.deposit(num2);
				break;
			case 2:
				System.out.println("얼마출금?");
				num2 = sc.nextDouble();
				a1.withdraw(num2);
				break;
			case 3:
				a1.showinfo();
				break;
			}
		}
	}

}

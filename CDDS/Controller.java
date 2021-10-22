package Personal_Controller;

import java.util.ArrayList;
import java.util.Scanner;

import personal_Service.StockService;
import personal_DTO.stockDTO;

public class Controller {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<stockDTO> dtos;
		StockService service = new StockService();
		int choice = 0;
		String company, ceo;
		int stockprice, marketcap, revenue, netincome;
		while(true)
		{
			menu();
			choice = sc.nextInt();
			if(choice==1) {
				dtos=service.getAllstocks();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("ȸ���:%s  ", dtos.get(i).getCompany());
					System.out.printf("��ǥ�̻�:%s ", dtos.get(i).getCeo());
					System.out.printf("�ְ�:%d�� ", dtos.get(i).getStockprice());
					System.out.printf("�ð��Ѿ�:%d��� ", dtos.get(i).getMarketcap());
					System.out.printf("�����:%d��� ", dtos.get(i).getRevenue());
					System.out.printf("������:%d��� \n", dtos.get(i).getNetincome());
				}
				dtos.clear();
				System.out.println("");
			}
			else if(choice==2) {
				dtos=service.getRevenueDESC();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("ȸ���:%s  ", dtos.get(i).getCompany());
					System.out.printf("��ǥ�̻�:%s ", dtos.get(i).getCeo());
					System.out.printf("�ְ�:%d�� ", dtos.get(i).getStockprice());
					System.out.printf("�ð��Ѿ�:%d��� ", dtos.get(i).getMarketcap());
					System.out.printf("�����:%d��� ", dtos.get(i).getRevenue());
					System.out.printf("������:%d��� \n", dtos.get(i).getNetincome());
				}
				dtos.clear();
				System.out.println("");
			}
			else if(choice==3) {
				System.out.print("ȸ��� �Է�:");
				sc.nextLine();
				company=sc.nextLine();
				System.out.print("��ǥ�̻� �Է�:");
				ceo=sc.next();
				System.out.print("�ְ� �Է�:");
				stockprice=sc.nextInt();
				System.out.print("�ð��Ѿ� �Է�:");
				marketcap=sc.nextInt();
				System.out.print("����� �Է�:");
				revenue=sc.nextInt();
				System.out.print("������ �Է�:");
				netincome=sc.nextInt();
				service.AddStock(company, ceo, stockprice, marketcap, revenue, netincome);
			}
			else if(choice==4) {
				System.out.print("ȸ��� �Է�:");
				sc.nextLine();
				company=sc.nextLine();
				System.out.print("�ְ� �Է�:");
				stockprice=sc.nextInt();
				service.UpdateStockPrice(company, stockprice);
			}
			else if(choice==5) {
				System.out.println("ȸ��� �Է�:");
				company=sc.next();
				service.DeleteStock(company);
			}
			else if(choice==6) {
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("1.��� ����� ��ȸ");
		System.out.println("2.����׼� �˻�");
		System.out.println("3.����� �߰�");
		System.out.println("4.����� ����");
		System.out.println("5.����� ����");
		System.out.println("6.����");
	}
}
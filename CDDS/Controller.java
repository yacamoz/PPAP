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
					System.out.printf("회사명:%s  ", dtos.get(i).getCompany());
					System.out.printf("대표이사:%s ", dtos.get(i).getCeo());
					System.out.printf("주가:%d원 ", dtos.get(i).getStockprice());
					System.out.printf("시가총액:%d억원 ", dtos.get(i).getMarketcap());
					System.out.printf("매출액:%d억원 ", dtos.get(i).getRevenue());
					System.out.printf("순이익:%d억원 \n", dtos.get(i).getNetincome());
				}
				dtos.clear();
				System.out.println("");
			}
			else if(choice==2) {
				dtos=service.getRevenueDESC();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("회사명:%s  ", dtos.get(i).getCompany());
					System.out.printf("대표이사:%s ", dtos.get(i).getCeo());
					System.out.printf("주가:%d원 ", dtos.get(i).getStockprice());
					System.out.printf("시가총액:%d억원 ", dtos.get(i).getMarketcap());
					System.out.printf("매출액:%d억원 ", dtos.get(i).getRevenue());
					System.out.printf("순이익:%d억원 \n", dtos.get(i).getNetincome());
				}
				dtos.clear();
				System.out.println("");
			}
			else if(choice==3) {
				System.out.print("회사명 입력:");
				sc.nextLine();
				company=sc.nextLine();
				System.out.print("대표이사 입력:");
				ceo=sc.next();
				System.out.print("주가 입력:");
				stockprice=sc.nextInt();
				System.out.print("시가총액 입력:");
				marketcap=sc.nextInt();
				System.out.print("매출액 입력:");
				revenue=sc.nextInt();
				System.out.print("순이익 입력:");
				netincome=sc.nextInt();
				service.AddStock(company, ceo, stockprice, marketcap, revenue, netincome);
			}
			else if(choice==4) {
				System.out.print("회사명 입력:");
				sc.nextLine();
				company=sc.nextLine();
				System.out.print("주가 입력:");
				stockprice=sc.nextInt();
				service.UpdateStockPrice(company, stockprice);
			}
			else if(choice==5) {
				System.out.println("회사명 입력:");
				company=sc.next();
				service.DeleteStock(company);
			}
			else if(choice==6) {
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("1.모든 상장사 조회");
		System.out.println("2.매출액순 검색");
		System.out.println("3.상장사 추가");
		System.out.println("4.상장사 수정");
		System.out.println("5.상장사 삭제");
		System.out.println("6.종료");
	}
}
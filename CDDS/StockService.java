package personal_Service;

import java.util.ArrayList;
import personal_DAO.StockDao;
import personal_DTO.stockDTO;

public class StockService {

	private StockDao dao;
	//회원정보 조회, 모두조회
	public StockService() {
		dao=new StockDao();
	}
	public ArrayList<stockDTO> getAllstocks() {
		return dao.getAllstocks();
	}
	public ArrayList<stockDTO> getRevenueDESC() {
		return dao.getRevenueDESC();
	}
	public void AddStock(String company, String ceo, int stockprice, int marketcap, int revenue, int netincome) {
		dao.AddStock(company, ceo, stockprice, marketcap, revenue, netincome);
	}
	public void UpdateStockPrice(String company, int stockprice) {
		dao.UpdateStockPrice(company, stockprice);
	}
	public void DeleteStock(String company) {
		dao.DeleteStock(company);
	}
}
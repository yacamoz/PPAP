package personal_DTO;

public class stockDTO {
	private String company;
	private String ceo;
	private int stockprice, marketcap, revenue, netincome;
	
	public stockDTO(String company, String ceo, int stockprice, int marketcap,
			int revenue, int netincome){
		this.company=company;
		this.ceo=ceo;
		this.stockprice=stockprice;
		this.marketcap=marketcap;
		this.revenue=revenue;
		this.netincome=netincome;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}
	public void setCeo(String ceo) {
		this.ceo=ceo;
	}
	public String getCeo() {
		return ceo;
	}
	public void setStockprice(int stockprice) {
		this.stockprice=stockprice;
	}
	public int getStockprice() {
		return stockprice;
	}
	public void setMarketcap(int marketcap) {
		this.marketcap=marketcap;
	}
	public int getMarketcap() {
		return marketcap;
	}
	public void setRevenue(int revenue) {
		this.revenue=revenue;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setNetincome(int netincome) {
		this.netincome=netincome;
	}
	public int getNetincome() {
		return netincome;
	}
}

package personal_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import personal_DTO.stockDTO;

public class StockDao {
	private ArrayList<stockDTO> dtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public StockDao() {
		dtos = new ArrayList<stockDTO>();
		try {
			String user="system";
			String pw ="12345";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,pw);
			st=con.createStatement();
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 오류:"+e.getMessage());
		}
	}

	public ArrayList<stockDTO> getAllstocks() {
		String SQL="select * from stock";
		try {
			rs=st.executeQuery(SQL);
			//statement가 executeQuery메서드로 SQL을 실행한 결과가 rs에 담긴다.
			while(rs.next()) {
				String company = rs.getString("company");
				String ceo = rs.getString("ceo");
				int stockprice = rs.getInt("stockprice");
				int marketcap = rs.getInt("marketcap");
				int revenue = rs.getInt("revenue");
				int netincome = rs.getInt("netincome");
				
//				System.out.printf("책 제목:%s ", id);
//				System.out.printf("저자:%s ", pw);
				stockDTO DTO=new stockDTO(company, ceo, stockprice, marketcap, revenue, netincome);
				dtos.add(DTO);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
	public ArrayList<stockDTO> getRevenueDESC() {
		String SQL="select * from stock order by revenue DESC";
		try {
			rs=st.executeQuery(SQL);
			//statement가 executeQuery메서드로 SQL을 실행한 결과가 rs에 담긴다.
			while(rs.next()) {
				String company = rs.getString("company");
				String ceo = rs.getString("ceo");
				int stockprice = rs.getInt("stockprice");
				int marketcap = rs.getInt("marketcap");
				int revenue = rs.getInt("revenue");
				int netincome = rs.getInt("netincome");
				stockDTO DTO=new stockDTO(company, ceo, stockprice, marketcap, revenue, netincome);
				dtos.add(DTO);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
	public void AddStock(String company, String ceo, int stockprice, int marketcap, int revenue,
			int netincome) {
		String SQL="insert into stock(company,ceo,stockprice,marketcap,revenue,netincome) values(?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1, company);
			pstmt.setString(2, ceo);
			pstmt.setInt(3, stockprice);
			pstmt.setInt(4, marketcap);
			pstmt.setInt(5, revenue);
			pstmt.setInt(6, netincome);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateStockPrice(String company, int stockprice) {
		String SQL="update stock set stockprice=? where company=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1, stockprice);
			pstmt.setString(2, company);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void DeleteStock(String company) {
		String SQL="delete from stock where company=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1, company);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


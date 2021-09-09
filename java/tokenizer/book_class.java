package tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

class Book {
private String BookName;
private String Author;
private String Publisher;
private String PublishingYear;
private int Page;
private String LibraryName;
private int ID;
private String StorePlace;
private int CheckOutNum;
private boolean isCheckOut;
private boolean RVT;
//책 이름, 저자, 출판사, 출판년도, 페이지, 소장도서관, 아이디, 소장처, 대출횟수, 대출여부
	public Book() {
		BookName="기본책";
		Author="기본저자";
		Publisher="기본출판사";
		PublishingYear="0000-00-00";
		Page=0;
		LibraryName="기본도서관";
		ID=0;
		StorePlace="기본자료실";
		CheckOutNum=0;
		isCheckOut=false;
		RVT=false;
	}

	public Book(String BookName, String Author, String Publisher, String PublishingYear, int page, String LibraryName, int ID, String StorePlace, int CheckOutNum, boolean isCheckOut) {
		this.BookName=BookName;
		this.Author=Author;
		this.Publisher=Publisher;
		this.PublishingYear=PublishingYear;
		this.Page=page;
		this.LibraryName=LibraryName;
		this.ID=ID;
		this.StorePlace=StorePlace;
		this.CheckOutNum=CheckOutNum;
		this.isCheckOut=isCheckOut;
		this.RVT=false;
	}
	public int getID() {
		return ID;
	}
	public boolean getrvt() {
		return RVT;
	}
	public void setrvt(boolean RVT) {
		this.RVT=RVT;
	}
	public boolean getisCheckOut() {
		return isCheckOut;
	}
	public String getname() {
		return BookName;
	}
	public String getauthor() {
		return Author;
	}
	public String getpublisher() {
		return Publisher;
	}
	public String getlibraryname() {
		return LibraryName;
	}
	public String getpy() {
		return PublishingYear;
	}
	public void showinfo() {
		System.out.printf("책 제목:%s\n", BookName);
		System.out.printf("저자:%s\n", Author);
		System.out.printf("출판사:%s\n", Publisher);
		System.out.printf("소장처:%s\n", LibraryName);
		System.out.printf("출판날짜:%s\n", PublishingYear);
	}
	
}
//각 결과값을 배열에 할당 시키고, 시작년-끝년 사이의 숫자에 있는 모든 애들을 불러
//똑같이 월 일도 해서 찍기.
//토크나이저로 만든 인트형 자료를 배열화 하는 법을 찾자
//1.토크나이저로 쪼갠 애들을 어떻게 배열화하죠?
//2.
public class book_class {

}

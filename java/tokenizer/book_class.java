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
//å �̸�, ����, ���ǻ�, ���ǳ⵵, ������, ���嵵����, ���̵�, ����ó, ����Ƚ��, ���⿩��
	public Book() {
		BookName="�⺻å";
		Author="�⺻����";
		Publisher="�⺻���ǻ�";
		PublishingYear="0000-00-00";
		Page=0;
		LibraryName="�⺻������";
		ID=0;
		StorePlace="�⺻�ڷ��";
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
		System.out.printf("å ����:%s\n", BookName);
		System.out.printf("����:%s\n", Author);
		System.out.printf("���ǻ�:%s\n", Publisher);
		System.out.printf("����ó:%s\n", LibraryName);
		System.out.printf("���ǳ�¥:%s\n", PublishingYear);
	}
	
}
//�� ������� �迭�� �Ҵ� ��Ű��, ���۳�-���� ������ ���ڿ� �ִ� ��� �ֵ��� �ҷ�
//�Ȱ��� �� �ϵ� �ؼ� ���.
//��ũ�������� ���� ��Ʈ�� �ڷḦ �迭ȭ �ϴ� ���� ã��
//1.��ũ�������� �ɰ� �ֵ��� ��� �迭ȭ����?
//2.
public class book_class {

}

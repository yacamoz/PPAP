package padlet;

class ggurugi {
	int year;
	
	public ggurugi() {
		year=0;
	}
	
	public ggurugi(int year) {
		this.year=year;
	}
	public void tti() {
		int tti=year%12;
		switch(tti) {
		case 0:{
			System.out.print("�����̶�");
			break;
		}//case 0 end
		case 1:{
			System.out.print("�߶�");
			break;
		}//case end
		case 2:{
			System.out.print("����");
			break;
		}//case 0 end
		case 3:{
			System.out.print("100�ϵڿ� ���� �ֶ�");
			break;
		}//case end
		case 4:{
			System.out.print("�����̶�");
			break;
		}//case 0 end
		case 5:{
			System.out.print("�Ҷ�");
			break;
		}//case end
		case 6:{
			System.out.print("ū����̶�");
			break;
		}//case 0 end
		case 7:{
			System.out.print("���Ŀն�");
			break;
		}//case end
		case 8:{
			System.out.print("����ǵ�����");
			break;
		}//case 0 end
		case 9:{
			System.out.print("���");
			break;
		}//case end
		case 10:{
			System.out.print("�����׶�");
			break;
		}//case 0 end
		case 11:{
			System.out.print("Ī������");
			break;
		}//case end
	}//switch end
	}
	
}

public class moonje0202 {

	public static void main(String[] args) {
		ggurugi gg1=new ggurugi(1995);
		gg1.tti();

	}

}

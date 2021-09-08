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
			System.out.print("¿ø¼şÀÌ¶ì");
			break;
		}//case 0 end
		case 1:{
			System.out.print("´ß¶ì");
			break;
		}//case end
		case 2:{
			System.out.print("°³¶ì");
			break;
		}//case 0 end
		case 3:{
			System.out.print("100ÀÏµÚ¿¡ ¸ÔÈù ¾Ö¶ì");
			break;
		}//case end
		case 4:{
			System.out.print("ÂïÂïÀÌ¶ì");
			break;
		}//case 0 end
		case 5:{
			System.out.print("¼Ò¶ì");
			break;
		}//case end
		case 6:{
			System.out.print("Å«°í¾çÀÌ¶ì");
			break;
		}//case 0 end
		case 7:{
			System.out.print("¹ø½Ä¿Õ¶ì");
			break;
		}//case end
		case 8:{
			System.out.print("»ó»óÀÇµ¿¹°¶ì");
			break;
		}//case 0 end
		case 9:{
			System.out.print("¹ì¶ì");
			break;
		}//case end
		case 10:{
			System.out.print("È÷ÀÌÀ×¶ì");
			break;
		}//case 0 end
		case 11:{
			System.out.print("Äªµû¿À¶ì");
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

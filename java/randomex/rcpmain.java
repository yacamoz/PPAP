package randomex;
import java.util.Random;
class rcp{
	private int record[];
	private double winrate;
	private Random rand;
	
	public rcp(){
	record=new int[3];	
	winrate = 0;
	rand = new Random();}
	
	
	public void play(int user, int com) {
		if(user==com) {
			record[1]++;
		}
		else if (user==1) {
			if(user==1&&com==2) {
				record[2]++;
			}
			else if (com==3) {
				record[0]++;
			}
		}
		else if (user==2) {
			if(com==1) {
				record[0]++;
			}
			else if (com==3) {
				record[2]++;
			}
		}
		else if (user==3) {
			if(com==1) {
				record[2]++;
			}
			else if (com==2) {
				record[0]++;
			}
		}
	}
}
public class rcpmain {

	public static void main(String[] args) {
		lottery lot = new lottery(12000);
		lot.lotteryy();
		lot.shownum();
	}

}

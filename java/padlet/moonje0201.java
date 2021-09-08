package padlet;

import java.util.Scanner;

class circle {
	Scanner sc = new Scanner(System.in);
	double rad = 0;
	final double pi=3.14;
	
	public circle(double r) {
		if(r<0) {
			this.rad=-r;
		}
		else {
		this.rad=r;}
	}
	
	public double getArea() {
		return (rad*rad)*pi;
	}
}

public class moonje0201 {

	public static void main(String[] args) {
		circle cc=new circle(-5);
		System.out.printf("%.1f", cc.getArea());

	}

}

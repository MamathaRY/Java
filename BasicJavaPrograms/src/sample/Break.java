package sample;

public class Break {

	public static void main(String args[]) {
		int n=1;
		while (n != 11) {
			System.out.println("N = " + n);
			n++;
			if(n>=6) {
				break;
			}
		}
		System.out.println("Out of loop");

	}

}

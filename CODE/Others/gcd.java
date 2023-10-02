package Contest1;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long N1 = scn.nextLong();
		long N2 = scn.nextLong();
		long rem = N1%N2;
		while(rem>0) {
			N1 = N2;
			N2 = rem;
			rem = N1%N2;
		}
		System.out.println(N2);

	}

}

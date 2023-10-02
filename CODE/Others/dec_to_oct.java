package Contest1;

import java.util.Scanner;

public class dec_to_oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long multiply = 1;
		long ans = 0;
		
		while(n>=8) {
			long remain = n%8;
			ans+=remain*multiply;
			multiply*=10;
			n = n/8;
		}
		
		ans = ans+n*multiply;
		System.out.println(ans);

	}

}

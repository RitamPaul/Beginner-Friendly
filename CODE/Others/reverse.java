package Contest1;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		
		long reverse = 0;
		while(num>0) {
			long rem = num%10;
			reverse = (reverse*10)+rem;
			num = num/10;
		}
		System.out.println(reverse);
		
	}

}

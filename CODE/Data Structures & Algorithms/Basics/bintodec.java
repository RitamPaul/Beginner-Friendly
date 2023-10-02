package Contest1;

import java.util.Scanner;

public class bintodec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long i = 0;
		long ans = 0;
		while(num>0) {
			long digit = num%10;
			ans+=digit*(Math.pow(2, i));
			i++;
			num = num/10;
			
		}
		System.out.println(ans);
	}

}

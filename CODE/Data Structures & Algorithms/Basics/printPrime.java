package Contest1;

import java.util.Scanner;

public class printPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long i = 1;
		long count = 0;
		long j = 1;
		
		while(i<=n) {
			count = 0;
			j = 1;
			while(j<=i) {
			if(i%j == 0) {
				count++;
			}
			j++;
			}
			if(count == 2) {
				System.out.println(i);
				}
			i++;
		}
		
		
		
	}

}

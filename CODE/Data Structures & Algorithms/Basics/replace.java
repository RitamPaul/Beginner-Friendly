package Contest1;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long ans = 0;
		long multiply = 1;
		if(n == 0){
            ans = 5;
        }
		
		while(n>0) {
			
			long digit = n%10;
			if(digit == 0) {
				ans += 5*multiply;
			}
			else {
				ans += digit*multiply;
			}
			multiply*=10;
			n = n/10;
		}
		System.out.println(ans);
	}

}

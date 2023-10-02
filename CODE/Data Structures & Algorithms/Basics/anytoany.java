package Contest1;

import java.util.Scanner;

public class anytoany {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		int dn = 0;
		
		
		//convert to base 10
		int i = 0;
		int n = sn;
		int ans = 0;
		while(n>0) {
			int digit = n%10;
			ans+=Math.pow(sb, i)*digit;
			i++;
			n = n/10;
		}
		//ans is the base 10 answer
		//System.out.println(ans);
		
		//base 10 to final ans
		n = ans;
		
		int multiply = 1;
		while(n>=db) {
			int remain = n%db;
			dn+=remain*multiply;
			multiply*=10;
			n = n/db;
		}
		
		dn = dn+n*multiply;
		System.out.println(dn);
	}

}

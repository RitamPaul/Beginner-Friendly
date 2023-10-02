package Contest1;

import java.util.Scanner;

public class inverse {
	/*32145-> 12543 
	 here 5 was at 1 place so now 1 goes to 5 place..4 was at 2nd place 
	 now 2 goes to 4 place and so on
	 indexing starts from rhs */
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long ans = 0;
		long multiply =1 ;
		long i = 1;
		long n = scn.nextLong();
		while(n>0) {
			multiply = 1;
		
			long digit = n%10;
			long j = 1;
			while(j<digit) {
				multiply*=10;
				j++;
			}
			ans+=i*multiply;
			n = n/10;
			i++;
	}
		System.out.println(ans);
	
	
	}	 
	 

}

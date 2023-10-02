package Contest1;

import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		int i = 0;
		while(i<n) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		System.out.println(n1);
	
	
	}
}

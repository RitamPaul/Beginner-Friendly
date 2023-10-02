package Contest1;

import java.util.Scanner;

public class quad {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();//coeff of x^2
		int b = scn.nextInt();//coeff of x
		int c = scn.nextInt();//constant term
		
		int D = (int) Math.pow(b, 2)-(4*a*c);//discriminant
		//int ans = (int) Math.pow(D, 0.5);
		//System.out.println(ans);
		
		if(D>0) {
			System.out.println("Real and Distinct");
			int r1 = (int) (( (-b)+ Math.pow(D,0.5) )/(2*a));
			int r2 = (int) (( (-b) - Math.pow(D,0.5) )/(2*a));
			if(r1>r2) {
				System.out.print(r2+" "+r1);
			}
			else {
				System.out.print(r1+" "+r2);
			}
		}
		
		else if(D==0) {
			System.out.println("Real and Equal");
			int r1 = (int) ((-b)+ Math.pow(D,0.5))/(2*a);
			System.out.print(r1+" "+r1);
		}
		
		else {
			System.out.println("Imaginary");
		}
		
	
		}

}

package Contest1;

import java.util.Scanner;

public class primefact1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long i = 2;
		
		while(num>0){
		    while(num>1){
		        if(num%i == 0){
		            System.out.print(i+" ");
		            num = num/i;
		        }
		        else{
		        i++;}
		    }
		    
		}

	}
}

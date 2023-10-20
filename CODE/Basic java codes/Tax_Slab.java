// Calculating tax amount according to use input salary
import java.util.*;
public class Tax_Slab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary ");
        int sal=sc.nextInt();
        if(sal<250000)
            System.out.println("tax amt = 0 ");
        else if (sal>250000&&sal<=500000){
            System.out.println("tax amt="+(0.05*sal));
        } else if (sal>500000&&sal<=1000000){
            System.out.println("tax amt ="+(0.2*sal));
        }
        else{
            System.out.println("tax amt ="+(0.3*sal));
        }
    }
}

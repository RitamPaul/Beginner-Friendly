// Toggling bit value in a user input number at user input position
import java.util.*;
public class toggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number and position to be toggled");
        int n=sc.nextInt();
        int pos= sc.nextInt();
        int bitmask=1<<pos;
        int newnum=bitmask^n;//we toggle bits of a number using xor operator
        System.out.println("toggled number is="+newnum);
    }
}

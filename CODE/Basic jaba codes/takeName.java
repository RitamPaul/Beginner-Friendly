import java.util.*;
public class takeName {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        String[] name=new String[size];
        System.out.println("enter names");
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        System.out.println("given names are :-");
        for (int i=0;i<size;i++){
            System.out.println(name[i]);
        }
    }
}

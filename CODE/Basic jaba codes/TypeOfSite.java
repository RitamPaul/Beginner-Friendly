import java.util.*;
public class TypeOfSite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter site name");
        String site = sc.nextLine();
        if(site.endsWith(".com"))
            System.out.println("commercial site");
        if(site.endsWith(".in"))
            System.out.println("indian site");
        if(site.endsWith(".org"))
            System.out.println("organisational site");
    }
}
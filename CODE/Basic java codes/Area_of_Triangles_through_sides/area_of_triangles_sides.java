import java.util.*;

public class area_of_triangles_sides {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Area of Triangle using sides through Heron's Formula
        System.out.print("Enter the sides of the triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter the sides of the triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the sides of the triangle: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle is: " + area + " sq units");
    }
}

import java.util.*;

public class trigonometric_ratios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of sides A : ");
        double a = sc.nextInt();
        System.out.print("Enter the value of sides B : ");
        double b = sc.nextInt();
        System.out.print("Enter the value of sides C : ");
        double c = sc.nextInt();

        // Defining the trigonometric ratios sin, cos, tan
        double sin = a / c;
        double cos = b / c;
        double tan = a / b;

        // Defining the trigonometric ratios sec, cosec, cot
        double sec = 1 / cos;
        double cosec = 1 / sin;
        double cot = 1 / tan;

        System.out.println("The value of sin is : " + sin);
        System.out.println("The value of cos is : " + cos);
        System.out.println("The value of tan is : " + tan);
        System.out.println("The value of sec is : " + sec);
        System.out.println("The value of cosec is : " + cosec);
        System.out.println("The value of cot is : " + cot);

        // Area of triangle using Heron's Formula
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is : " + area);

    }
}

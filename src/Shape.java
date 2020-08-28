import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Circle userCircle = new Circle();

        System.out.println("Enter centerpoint");
        userCircle.setCenterPoint(scnr.nextInt());

        System.out.println("Enter radius");
        userCircle.setRadius(scnr.nextInt());

        userCircle.computeArea();
    }
}

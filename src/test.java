import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        numOne = scnr.nextInt();
        numTwo = scnr.nextInt();
        numThree = scnr.nextInt();

        if (numOne < numTwo && numTwo < numThree) {
            System.out.println("Numbers are increasing!");
        } else if (numOne > numTwo && numTwo > numThree) {
            System.out.println("Numbers are decreasing!");
        } else {
            System.out.println("Neither decreasing or Increasing!");
        }
    }
}
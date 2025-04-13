import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("the total sum of the numbers which you have entered is " + sum);
    }
}

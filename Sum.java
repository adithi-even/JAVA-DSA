import java.util.*;

public class Sum {
    public static void main(String args[]){
        sum();
    }

    static void sum(){

        Scanner Sum = new Scanner(System.in);

        System.out.print("enter the number 1 :" );
        int num1 = Sum.nextInt();
        System.out.println("entered number is :" + num1);

        System.out.print("enter the number 2 :" );
        float num2 = Sum.nextFloat();
        System.out.println("enter the float number 2 :" + num2);
        
        float sum = num1 + num2 ;
        System.out.println("the sum of num1 and num2 is " + sum);    

    }


}

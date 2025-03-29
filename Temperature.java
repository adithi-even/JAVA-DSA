import java.util.* ;

public class Temperature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter the celcius : ");

        
        // int cel = temp.nextInt();

        // int farenheit = cel * 9 / 5 + 32  ;
        float cel = temp.nextFloat();

        float farenheit = cel * 9 / 5 + 32  ;

        System.out.println("the farenheit is : " + farenheit);

        temp.close();
    }
}

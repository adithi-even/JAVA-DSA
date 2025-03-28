
public class Typecasting {
    public static void main(String[] args) {
        // Scanner casting = new Scanner(System.in);
        
        // // type casting example 1
        // int num = (int)(65.98f);
        // System.out.println("this is the float casted into int : " + num);
        
        // // automatic type promotion example
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);
        

        byte b = 42;
        char c = 'b';
        short  s = 1025;
        int i = 900;
        float f = 12.3049f;
        double d = 1.25478;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        //if in an expression we have different data types then the data type of the result will be the highest data type in the expression
        System.out.println((f *b) + "   " + (i / c) + "   " + (d * s));
        System.out.println("result = " + result);


        // Don't forget to close the Scanner
        // casting.close();
    }
}


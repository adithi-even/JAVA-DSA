import java.util.* ;
class inputs {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int x =10;
        Scanner inputs = new Scanner (System.in);
        // System.out.print("Please enter some input or enter a number: ");
        // int rollNo = inputs.nextInt();
        // System.out.println("Your roll number is " + rollNo) ; 

        System.out.print("type your input : " );
        String type = inputs.nextLine();
        System.out.println("Your input is " + type) ;
        
        System.out.print("type your float : " );
        float marks = inputs.nextFloat();
        System.out.println(marks);
        
        
        
    }
}
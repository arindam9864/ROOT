import java.util.Scanner; 

public class hellouser {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 

      
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        System.out.println("The String is: " + str);

       
        System.out.print("Enter an integer: ");
        int num = scn.nextInt();
        System.out.println("Number is: " + num);

      
        System.out.print("Enter a floating-point number: ");
        float fnum = scn.nextFloat();
        System.out.println("The floating num is: " + fnum);

    }
}

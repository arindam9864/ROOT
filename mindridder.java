public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("============= Guess the Answers =============");

        System.out.println("Unary Operator  " + (a++));
        System.out.println("Unary Operator  " + (++b));

        System.out.println("Binary Operator:");
        System.out.println("1+2" + 1 + 2);  
        System.out.println("1+2" + (1 + 2)); 
        System.out.println(1 + 2 + " =3"); 

        int increment = ++a * b++;
        System.out.println("Result of (++a * b++): " + increment);

        
        System.out.println("Ternary Operator:");
        int largestNumber = (a > b) ? a : b;
        System.out.println("Largest of 2 numbers: " + largestNumber);
    }

import java.util.Scanner;
public class MyMain {


    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int x = scan.nextInt();
        System.out.println("enter another number");
        int y = scan.nextInt();
        System.out.println("enter another number");
        int z = scan.nextInt();
        if (x > y && z > x || x < y && z < x) {
            return x;
        } else if (y < x && y > z || y > x && y < z) {
            return y;
        } else if (z > x && z < y || z < x && z > y) {
            return z;


        }
        // REPLACE WITH YOUR CODE
        return 0;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int x = scan.nextInt();
        System.out.println("enter another number");
        int y = scan.nextInt();

        int positiveX=x;
        if (x < 0) {
            positiveX = x * -1;
        }
        int positiveY=y;
        if (y < 0) {
            positiveY = y * -1;
        }
        if (positiveX > positiveY) {
            return x;
        } else if (positiveY > positiveX) {
            return y;
        }

        return 0; // REPLACE WITH YOUR CODE
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("enter another number");
        int y = scan.nextInt();
        return (Math.sqrt(x * x + y * y)); // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        Scanner scan = new Scanner(System.in);
        System.out.println("Which calculator do you want to use?");
        String x = scan.nextLine();
        if (x.equals("magnitude")) {
            System.out.println(magnitude(-7, -1));
        }else if (x.equals("median")) {
            System.out.println(median(1, 2, 3));
        }else if (x.equals("pythagoras")) {
                    System.out.println(pythagoras(3, 4));
                }
        //System.out.println(median(1, 2, 3)); // should be 2
        //System.out.println(magnitude(-7, -1)); // should be -7
        //System.out.println(pythagoras(3, 4)); // should be 5.0


    }

    //public static String choose(String x) {

            }

       // return x;


//    public static String choose();
//    Scanner scan = new Scanner(System.in);
//        System.out.println("Which calculator would you like to use?");
//                String x=scan.nextLine();
//                if (x == "median");
//                int median;
//                if (x == "magnitude");
//                int magnitude;
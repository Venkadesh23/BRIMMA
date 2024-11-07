import java.util.*;

public class Nested_Function {

    // BASE FUNCTION
    public static void numberfuncion(int number) {
        System.out.println("Entered number: "+number);
        factorial(number);
    }

    //   FACTORIAL FUNCTION
    public static void factorial(int number) {
        int fact=1;
        for (int i=1;i<=number;i++) {
            fact*=i;
        }
        System.out.println("Factorial of the Number: "+fact);

        System.out.print("Fibonacci series: ");
        for (int i=0;i<number;i++) {
            System.out.print(fibonacci(i)+ " ");
        }


        System.out.println();
        Square(number);
    }

    //   FIBONACCI SERIES METHOD
    public static int fibonacci(int number) {
        if (number<=1) {
            return number;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }


    // SQUARE FUNCTION
    public static void Square(int number)
    {
        System.out.println("Square of the number :"+number*number);
        Romanofnumber(number);
    }


    // ROMAN OF NUMBER METHOD
    public static void Romanofnumber(int number)
    {
        String M[] = {"", "M", "MM", "MMM"};//1000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};//100
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; //10 20
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};//1 2 3
        System.out.print("ROMAN NUMERAL : "+M[number/1000] + C[(number%1000)/100] + X[(number%100)/10] + I[number%10]);
        System.out.println();
        Isprime(number);
    }

    public static void Isprime(int number)
    {
        if (number<=1) {
            System.out.println(number+ " is not a prime number.");
            return;
        }

        for (int i=2; i*i<=number;i++) {
            if (number%i==0) {
                System.out.println(number+ " is not a prime number.");
                return;
            }
        }
        System.out.println(number+ " is a prime number.");
    }

    public static void main(String[] args) {
        //long st =System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        System.out.println();
        numberfuncion(number);
       //long et= System.currentTimeMillis();
        //System.out.println("Execution time: "+ (et-st) + " MS");
    }
}

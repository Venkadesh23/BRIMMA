import java.util.*;
import java.lang.*;
public class variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2); // ADDITION
        System.out.println(num1 - num2); // SUBTRACTION
        System.out.println(num1 * num2); // MULTIPLICATION
        System.out.println(num1 / num2); // DIVISION
        System.out.println(num1 % num2); // MODULO


        System.out.println(num1 & num2); //AND
        System.out.println(num1 | num2); //OR
        System.out.println(num1 >> num2);//RIGHT SHIFT
        System.out.println(num1 << num2);//LEFT SHIFT
        System.out.println(num1 ^ num2); //XOR


        System.out.println(num1 > num2);//GREATER
        System.out.println(num1 < num2);//LESSER
        System.out.println(num1 == num2);//EQUALS TO
        System.out.println(num1 != num2);//NOT EQUAL TO
        System.out.println(num1 >= num2);//GREATER THAN OR EQUAL TO
        System.out.println(num1 <= num2);//LESS THAN OR EQUAL TO

        System.out.println(num1++);// POST INCREMENT
        System.out.println(++num1);// PRE INCREMENT
        System.out.println(num2--);// POST DECREMENT
        System.out.println(--num2);// PRE DECREMENT

    }
}

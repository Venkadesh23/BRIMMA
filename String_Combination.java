import java.util.*;

public class String_Combination {
    public static void combinations(int num, String current) {
        if (current.length() / 2 == num) {
            return;
        }

        System.out.println(current.trim());
        combinations(num, current + (char)('A' + current.length()/2) + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        combinations(num+1, "");
    }
}

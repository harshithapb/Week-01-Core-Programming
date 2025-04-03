package Level1;
import java.util.*;
public class Quotient {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] arr = new int[2];
        arr[0] = number / divisor;
        arr[1] = number % divisor;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Enter divisor:");
        int d = sc.nextInt();
        arr = findRemainderAndQuotient(n, d);
        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
package Level2;
import java.util.*;
public class AgeTallest {
    public static void findYoungest(int[] age, String[] names) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < age.length; i++) {
            if (age[i] <= min) {
                min = age[i];
            }
        }
        System.out.println("Youngest are:");
        for (int i = 0; i < age.length; i++) {
            if (min == age[i]) {
                System.out.print(names[i] + " : " + age[i]);
            }
        }
        System.out.println();

    }

    public static void findTallest(int[] height, String[] names) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= max) {
                max = height[i];
            }
        }
        System.out.println("Tallest are:");
        for (int i = 0; i < height.length; i++) {
            if (max == height[i]) {
                System.out.print(names[i] + " : " + height[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", " Anthony"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  age of Amar, Akbar and Anthony: ");
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
        }
        System.out.println("Enter  height Amar, Akbar and Anthony: ");
        for (int i = 0; i < 3; i++) {
            height[i] = sc.nextInt();
        }
        findYoungest(age, names);
        findTallest(height, names);


    }
}

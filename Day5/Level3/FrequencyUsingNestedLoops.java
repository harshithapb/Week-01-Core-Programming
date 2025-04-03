package Level3;
import java.util.*;
public class FrequencyUsingNestedLoops {
    // Method to find frequency of characters using nested loops
    public static String[][] findFreq(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        // Marking all frequencies as -1 initially
        Arrays.fill(freq, -1);

        // Finding frequency of each character
        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) { // Only process characters not already counted
                freq[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        freq[j] = 0; // Mark duplicate characters as 0
                    }
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        // Store unique characters and their frequencies
        String[][] ans = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) {
                ans[idx][0] = String.valueOf(chars[i]);
                ans[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return ans;
    }

    public static void printArr(String[][] arr) {
        System.out.println("Char \tFreq");
        for (String[] entry : arr) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to find frequency:");
        String s = sc.nextLine();
        sc.close();

        String[][] ans = findFreq(s);
        printArr(ans);
    }
}

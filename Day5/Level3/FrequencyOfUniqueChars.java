package Level3;
import java.util.*;

public class FrequencyOfUniqueChars {
    static final int CHAR = 256;
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String s) {
        boolean[] isPresent = new boolean[CHAR]; // To check if a character is already added
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isPresent[ch]) {
                uniqueChars.append(ch);
                isPresent[ch] = true;
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of unique characters
    public static String[][] findFreq(String s) {
        int[] count = new int[CHAR];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(s);
        String[][] ans = new String[uniqueChars.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            ans[i][0] = Character.toString(uniqueChars[i]);
            ans[i][1] = String.valueOf(count[uniqueChars[i]]);
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

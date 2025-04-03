package Level3;
import java.util.*;
public class FrequencyOfChars {
    static final int CHAR = 256;

    public static String[][] findFreq(String s) {
        //String[][] ans=new String[][];
        int[] count = new int[CHAR];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int c=0;//unique char count
        for(int i=0;i<CHAR;i++){
            if(count[i]>0){
                c++;
            }
        }
        String[][] ans = new String[c][2];
        int idx=0;
        for (int i = 0; i <CHAR; i++) {
            if(count[i]>0){
                ans[idx][0] = Character.toString((char)i);
                ans[idx][1] = String.valueOf(count[i]);
                idx++;
            }
        }
        return ans;
    }

    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t       " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to find freq:");
        String s = sc.nextLine();
        String[][] ans = findFreq(s);
        System.out.println("Char \t freq");
        printArr(ans);

    }
}

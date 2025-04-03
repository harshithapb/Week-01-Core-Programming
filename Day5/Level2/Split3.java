package Level2;
import java.util.*;
public class Split3 {
    public static int lenOfString(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return count;
        }
    }
    public static int[] indicesOfSpaces(String s,int l){
        int count=0;
        for(int i=0;i<l;i++){
            if(Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }
        int [] indices=new int[count];int idx=0;
        for(int i=0;i<l;i++){
            if(Character.isWhitespace(s.charAt(i))){
                indices[idx]=i;
                idx++;
            }
        }
        return indices;
    }
    public static String[] splitText(String s,int[] indices){
        int l = lenOfString(s);
        int spaceCount = indicesOfSpaces(s,l).length;
        int wordCount=0;
        if (l == 0) {
            return new String[0];
        }

        if (spaceCount == 0) {
            return new String[]{s}; // Only one word if no spaces
        }

        wordCount = spaceCount + 1;
        String [] words=new String[wordCount];
        int si=0;
        for (int i=0;i<spaceCount;i++){
            words[i]=s.substring(si,indices[i]);
            si=indices[i]+1;
        }
        words[spaceCount] = s.substring(si);
        return words;
    }
    public static String[][] createArr(String[] words){
        String[][] arr=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arr[i][0]=words[i];
            arr[i][1]=String.valueOf(lenOfString(words[i]));
        }
        return arr;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void printArr(String[][] arr){
        System.out.println("Word \t length of word");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" \t" +arr[i][1]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text input:");
        String s=sc.nextLine();
        int[] indices=indicesOfSpaces(s,lenOfString(s));
        String [] ans1=splitText(s,indices);
        String [][] ans11=createArr(ans1);
        System.out.println("The words split using the created fn is :");
        printArr(ans11);
        String [] ans2=s.split(" ");
        String [][] ans22=createArr(ans2);
        System.out.println("The words split using split fn is :");
        printArr(ans22);


    }
}
//0,0   0,1
//1,0    1,1
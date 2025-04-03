package Level2;
import java.util.*;
public class Split {
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
    public static int[] length(String[][] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int small=-1;int large=-1;
        for(int i=0;i<arr.length;i++){
            if(min>Integer.parseInt(arr[i][1])){
                min=Integer.parseInt(arr[i][1]);
                small=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max<Integer.parseInt(arr[i][1])){
                max=Integer.parseInt(arr[i][1]);
                large=i;
            }
        }

        return new int[]{small,large};
    }
    public static void printArr(String[][] arr){
        System.out.println("Word \t length of word");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" \t" +arr[i][1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text input:");
        String s = sc.nextLine();
        int[] indices = indicesOfSpaces(s, lenOfString(s));
        String[] ans1 = splitText(s, indices);
        String[][] ans11 = createArr(ans1);
        System.out.println("The words split using the created fn is :");
        printArr(ans11);
        int[] arr=length(ans11);
        System.out.println("The smallest word is :"+" "+ans11[arr[0]][0]+ "  of length"+" "+ans1[arr[0]]);
        System.out.println("The largest word is :"+" " +ans11[arr[1]][0]+ "  of length"+" "+ans1[arr[1]]);
    }
}
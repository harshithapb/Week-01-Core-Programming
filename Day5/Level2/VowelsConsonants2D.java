package Level2;
import java.util.*;
public class VowelsConsonants2D {
    public static String isVowelOrConsonant(char c){
        if(Character.isUpperCase(c)){
            c=Character.toLowerCase(c);
        }
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return "Vowel";
        }
        else if(!Character.isLetter(c)){
            return "Not a letter";
        }
        else{
            return "Consonant";
        }
    }
    public static String[][] create(String s){
        String[][] str=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            String s1=isVowelOrConsonant(s.charAt(i));
            str[i][0]=""+s.charAt(i);
            str[i][1]=s1;
        }
        return str;
    }
    public static void print(String[][] ans){
        System.out.println("Vowel\t Their Result");
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0]+"  "+ans[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        String[][] ans=create(s);
        print(ans);


    }
}

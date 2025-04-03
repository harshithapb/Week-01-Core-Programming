package Level2;
import java.util.*;
public class VowelsConsonants {
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
    public static int[] count(String s){
        int v=0;int con=0;
        for(int i=0;i<s.length();i++){
            String res=isVowelOrConsonant(s.charAt(i));
            if(res.equals("Vowel")){
                v++;
            }
            if(res.equals("Consonant")){
                con++;
            }
        }
        return new int[]{v,con};

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int[] c=count(s);
        System.out.println("Count of vowels: "+c[0]+" \nCount of consonant :"+ c[1]);
    }
}

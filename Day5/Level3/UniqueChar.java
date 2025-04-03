package Level3;
import java.util.Arrays;
import java.util.Scanner;
public class UniqueChar {
    public static int findLength(String s){
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
    }// aabaaac
    public static char[] findUnique(String s){
        int l=findLength(s);
        int count=0;
        for(int i=0;i<l;i++){
            int flag=1;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                count++;
            }
        }
        char[] result=new char[count];
        int idx=0;
        for(int i=0;i<s.length();i++){
            boolean isUnique=true; //char c='';
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                result[idx]=(s.charAt(i));
                idx++;
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        char[] ans=findUnique(s);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

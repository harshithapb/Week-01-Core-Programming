package Level2;
import java.util.*;
public class Students {
    public static int[] ageCreate(int n){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*(150-10))+10;
        }
        return arr;
    }
    public static String[][] canVote(int [] age){
        String [][] arr=new String[age.length][2];
        for(int i=0;i<age.length;i++){
            if(age[i]<0){
                arr[i][1]="Cannot Vote";
            }
            else{
                arr[i][0]=String.valueOf(age[i]);
                if(age[i]>=18){
                    arr[i][1]="Can Vote";
                }
                else{
                    arr[i][1]="Cannot Vote";
                }
            }
        }
        return arr;
    }
    public static void print(String[][] arr){
        System.out.println("Age\t Voting Status");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of students:");
        int n=sc.nextInt();
        int[] ageStud=ageCreate(n);
        print(canVote(ageStud));

    }
}

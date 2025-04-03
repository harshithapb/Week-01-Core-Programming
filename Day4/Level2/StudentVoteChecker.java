package Level2;
import java.util.*;
public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        boolean ans=true;
        if (age > 0) {
            if(age>=18){
                ans=true;
            }
            else{
                ans=false;
            }
        }
        else{
            ans=false;
        }
        return ans;
    }
    public static void main(String [] args){
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student's age: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        StudentVoteChecker stud=new StudentVoteChecker();

        boolean ans=true;
        for(int i=0;i<10;i++){
           ans=stud.canStudentVote(arr[i]);
           if(ans){
               System.out.println("Student "+ (i+1)+" can vote");
           }
           else{
               System.out.println("Student "+ (i+1)+" cannot vote");
           }
        }
    }
}

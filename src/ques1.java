import java.util.Arrays;
import java.util.Scanner;
public class ques1 {
    public static void main(String [] args){
        System.out.println("Enter the size");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements on array one by one");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Contents of the array are: "+Arrays.toString(a));
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class ques4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted");
        for(int number:arr){
            System.out.print(number);
        }
        System.out.println(" ");
        System.out.println("Enter the value to be searched: ");
        int searchVal = sc.nextInt();
        int retVal = Arrays.binarySearch(arr,searchVal);
        System.out.println("Element found");
        System.out.println("The index of element in the sorted array: " + retVal);

    }
}

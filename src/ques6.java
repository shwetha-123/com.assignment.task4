import java.util.Scanner;
public class ques6 {
    public static void main(String args[]){
        int temp, size;
        System.out.println(("Enter the size"));
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            array[i] = value;

        }



        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Third largest number is:: "+array[size-3]);
    }
}


import java.util.Scanner;
public class ques5 {
    public static void main(String args[]){
        int row,col,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: of rows");
            i=sc.nextInt();
        System.out.println("Enter no: of columns");
        j=sc.nextInt();
        int array1[][] = new int[i][j];
        int array2[][] = new int[i][j];
        int sum[][] = new int[i][j];

        System.out.println("Input elements of first matrix");

        for (   row= 0 ; row < i ; row++ )
            for ( col = 0 ; col< j ; col++ )
                array1[row][col] = sc.nextInt();

        System.out.println("Input the elements of second matrix");

        for ( row= 0 ; row < i ; row++ )
            for ( col = 0 ; col < j ; col++ )
                array2[row][col] = sc.nextInt();

        for ( row = 0 ; row < i ; row++ )
            for ( col = 0 ; col < j ; col++ )
                sum[row][col] = array1[row][col] + array2[row][col];

        System.out.println("Sum of the matrices:-");

        for ( row = 0 ; row < i ; row++ )
        {
            for ( col = 0 ; col< j ; col++ )
                System.out.print(sum[row][col]+"\t");

            System.out.println();
        }



    }
}

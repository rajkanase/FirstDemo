import java.util.Scanner;

/**
 * Created by raj on 3/7/17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        int a=sc.nextInt();
        int j = 1;

        for (int i=a;i>=1;i--){

            j=j*i;

        }
        System.out.println("Factorial of given number is:"+j);

    }

}

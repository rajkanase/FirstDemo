import java.util.Scanner;

/**
 * Created by raj on 5/7/17.
 */
public class Aggregate {

    void percentage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1");
        int s1=sc.nextInt();

        System.out.println("Enter marks of sub 2");
        int s2=sc.nextInt();

        System.out.println("Enter marks of sub 3");
        int s3=sc.nextInt();

        System.out.println("Enter marks of sub 4");
        int s4=sc.nextInt();

        System.out.println("Enter marks of sub 5");
        int s5=sc.nextInt();

        int per= (s1+s2+s3+s4+s5)/5;
        System.out.println("Your Percentage are "+per);

        if(per>=80){
            System.out.println("Congratulations...!\nYour GRADE is A ");
        }
        else if (per>=70){
            System.out.println("Congratulations...!\nYour GRADE is B ");
        }
        else if (per>=50){
            System.out.println("Congratulations...!\nYour GRADE is C ");
        }
        else if (per>=35){
            System.out.println("Your GRADE is D ");
        }
        else{System.out.println("Sorry...! You are Fail..");}
    }
    public static void main(String[] args) {
        Aggregate ag=new Aggregate();
        ag.percentage();

    }
}

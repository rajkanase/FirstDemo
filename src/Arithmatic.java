/**
 * Created by raj on 6/7/17.
 */
public class Arithmatic {

    void Operations(int x, int y){

        int z=x+++y;
        System.out.println("Value of Z is :"+z);
        System.out.println("Modified X is "+x);

        int z1=++x+y;
        System.out.println("Value of Z1 is :"+z1);
        System.out.println("Modified X is:"+x);

        int z2=y+++x;
        System.out.println("Value of Z2 is :"+z2);
        System.out.println("Modified Y is:"+y);

        int z3=x+y++;
        System.out.println("Value of Z3 is:"+z3);
        System.out.println("Modified Y is:"+y);

    }
    public static void main(String[] args) {
        Arithmatic ar=new Arithmatic();
        ar.Operations(10,20);
    }
}

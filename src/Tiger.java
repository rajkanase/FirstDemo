import java.util.Timer;

/**
 * Created by raj on 6/7/17.
 */

class Animal extends Tiger{


    public static void main(String[] args) {
        //Tiger t=new Tiger();
        Animal a=new Animal();
        a.show();

    }
}
public class Tiger {
    int tiger_wt=500;
    int ele_wt=2000;

    void show(){
        System.out.println("Wt of Tiger is.."+tiger_wt);
        System.out.println("Wt of Elephant is.."+ele_wt);
    }

}

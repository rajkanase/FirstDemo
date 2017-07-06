/**
 * Created by raj on 4/7/17.
 */
public class ThisExample {

    int x;
    public ThisExample(){
        System.out.println("In default");
        show();
    }
    public ThisExample(int x){
        this();
        this.x=x;
        System.out.println("value of x is "+x);
    }
    void show(){

        System.out.println("in Show");
    }
    public static void main(String[] args) {
        ThisExample te=new ThisExample(10);
        //te.show();
    }
}

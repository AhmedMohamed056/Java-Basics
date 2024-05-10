import java.util.Scanner;

public class OOP {
    public static void main(String[] arg){
        //class and objects, overload, override
        //var Ahmed=new Human();
        Human Mohamed=new Human();
        Human Ahmed=new Human();
        Ahmed.name="Ahmed";//if I don't give it value will return null
        Ahmed.length=75;//if I don't give it value will return 0
        Ahmed.gender="male";
        Ahmed.work();
        Mohamed.length=80;
        Mohamed.name="Mohamed";
        Mohamed.gender="Male";
        Mohamed.work(75);
    }
}
class Human{
    String name;
    String gender;
    int length;
    public void work(){
        this.length+=5;
        System.out.println("enter your job: ");
        String work=new Scanner(System.in).nextLine();
        System.out.println(" I'm "+this.name+" I'm "+work+" I'm "+this.gender+" I'm "+this.length+" CM");
    }
    //overloading I make a small change in function like change parameters
    public void work(int length){
        System.out.println("enter your job: ");
        String work=new Scanner(System.in).nextLine();
        System.out.println(" I'm "+this.name+" I'm "+work+" I'm "+this.gender+" I'm "+(this.length+length)+" CM");
    }

}
class Human2 extends Human{
    //override when I change fun job with inheritance only

    @Override
    public void work() {
        //super.work(); will do work() function code
        System.out.println("enter your job: ");
        String work=new Scanner(System.in).nextLine();
        System.out.println("I'm "+work);
    }
}

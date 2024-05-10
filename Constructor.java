import java.util.Scanner;

public class Constructor {
    public static void main(String[] arg){
        //constructor, inheritance
        /*
        * constructor is method, but I don't need to call it when I create object it calls automatic.
        * the benefit of constructor is to give initial value to variable.
        *
        * */
        Human1 h=new Human1("Ahmed","male",75);
        h.work();
        //inheritance
        A a=new A();
        a.myage();
        B b=new B();
        b.info();
        /* super constructor if I take object for C will do constructors A,B,C together
        so if any constructor of super take  parameter we should pass it to subclass constructor then
        super(); in constructor udemy course super constructor
         */
        C c=new C();
        Human3 h1=new Human3("mohamed","male",75);//his constructor take this parameters
        //then he pass it to super class within super(); function
    }
}
class Human1{
    String name;
    String gender;
    int length;
    final double pi;
    Human1(String name, String gender, int length){
        this.name=name;
        this.gender=gender;
        this.length=length;
        this.pi = 3.14;
        System.out.println(this.pi);
    }
    public void work(){
        this.length+=5;
        System.out.println("enter your job: ");
        String work=new Scanner(System.in).nextLine();
        System.out.println(" I'm "+this.name+" I'm "+work+" I'm "+this.gender+" I'm "+this.length+" CM");
    }

}
//inheritance
//subclass can access attribute and methods on superclass unlike superclass
class A{//super class
    int age;
    A(){
        System.out.println("constructor A");
    }
    public void myage(){
        this.age=20;
        System.out.println("my age: "+this.age);
    }
}
class B extends A{//subclass
    int length;
    B(){
        super();//it preferred to write super, but it's ok if I don't write it.
        System.out.println("constructor B");
    }
    public void info(){
        this.length=150;
        super.age=22;
        System.out.println("my age: "+super.age+" my length "+this.length);
    }
}
class C extends B{//subclass
    C(){
        System.out.println("constructor C");
    }
}
class Human3 extends Human1{
    /* we should match super class constructor because when I take object from Human3
    he does Human1 constructor, so we should take a parameter when we take object then Bass parameter
    for super class.
     */
    Human3(String name, String gender, int length) {
        super(name, gender, length);
    }
}

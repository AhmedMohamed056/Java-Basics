public class Anonymous {
    public static void main(String[] arg){
        //the traditional way
        //create another class and extends then take object to access functions
        var Ba=new Ba();
        Ba.info();
        //we can use Anonymous class
        var Ba1=new Ab(){
            @Override
            void info() {
                System.out.println("Anonymous info");
                super.info1();
            }
        };
        Ba1.info();
        // connect between polymorphism and Anonymous class
        var poly1=new Poly();
        poly1.poly(new Ab() {
            @Override
            void info() {
                System.out.println("poly with anonymous");
            }
        });

    }
}
// connect between polymorphism and Anonymous class
class Poly{
    void poly(Ab ab){
        ab.info();
    }
}
abstract class Ab{
    abstract void info();
    void info1(){
        System.out.println("traditional method");
    }
}
//the traditional way
class Ba extends Ab{

    @Override
    void info() {
        System.out.println("traditional info");
        super.info1();
    }
}

public class Abstract {
    public static void main(String[] arg){
        var r=new Rectangle1();
        r.info();
        r.info1();
        var op=new Operation();
        op.sub(2,4);
        op.sum(3,4);
    }
}
// Abstract class = Interface
//the difference between Abstract class and interface that
// ( implements, every method in interface should be abstract method and by default is Abstract)
// I can't take object from abstract class or interface
// Abstract function that his body is empty
abstract class Shape3{
    abstract public void info();//without body
    public void info1(){
        System.out.println("info1");
    }
}
// to benefit from Abstract class I should extend from it
class Rectangle1 extends Shape3{
@Override
    public void info() {// I should make it implement because it Abstracts
        System.out.println("rectangle");
    }
}
//multi inheritance
// the job of interface to support multi inheritance
//class can't be extends more than one class but can implement more interfaces
//interface can ("extends") another interface but can't extends class
interface Sum{
    void sum(int a,int b);
}
interface Sub{
    void sub(int a,int b);
}
class Operation implements Sum,Sub{

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }
}

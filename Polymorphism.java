import javax.swing.*;

public class Polymorphism {
    public static void main(String[] arg){
        //polymorphism can't do it without inheritance and override
//        var s=new Shape();
//        s.shape1();
//        var c=new Circle();
//        c.shape1();
//        var r=new Rectangle();
//        r.shape1();
        Shape[] x=new Shape[3];
        x[0]=new Shape();//polymorphism
        x[1]=new Circle();//polymorphism
        x[2]=new Rectangle();//polymorphism
//        x[0].shape1();
//        x[1].shape1();
//        x[2].shape1();
        for (int i=0;i<x.length;i++){
            x[i].shape1();
        }
        //enhanced for
//        for (Shape s : x) {
//            s.shape1();
//        }
        // another way to do polymorphism
        var d=new Shape1();
        d.draw(new Shape());
        d.draw(new Circle());
        d.draw(new Rectangle());
    }
}
class Shape{
    public void shape1(){
        System.out.println("shape");
    }
}
class Circle extends Shape{
    @Override
    public void shape1() {
        System.out.println("circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void shape1() {
        System.out.println("Rectangle");
    }
}
// another way to do polymorphism
class Shape1{
    public void draw(Shape s){
        s.shape1();
    }
}

public class Static {
    public static void main(String[] arg){
        /* Access Modifier and Nested Class in udemy course
        * private can access inside the class only or if exist inner class
        * public is default
        * protected can access inside class and subclass which extends
        * */
        //var car2=new Car();
        //car2.f1();
        Car.f1();// because f1 is static
        Car.Car1 car1= new Car.Car1();// I can't take object without static
        car1.f2();
        myfun();
    }
    //when create class inside function I can't create object outside function
    public static void myfun(){
        class AA{
            public void info(){
                System.out.println("info");
            }
        }
        var aa=new AA();
        aa.info();
    }
}
// static can access it directly
class Car{//outer class
    public static void f1(){ // if I make it private I can't access it outside the class and inner class
        System.out.println("car");
    }
    static class Car1{//inner class
        public void f2(){
            System.out.println("car1");
            f1();// I can't access it without static
        }
    }
}



package Dummy;

public class TestInterface implements Ak {
    @Override
    public void printHello() {
        System.out.println("from Test");
    }

    public static void main(String[] args) {
     TestInterface t = new TestInterface();
t.printHello();

    }


}




interface Ak{
     int a =10;
     default void printHello(){
       System.out.println("hello from Ak");
   }
}

//interface pk extends Ak{
//      default void printHello(){
//        System.out.println("hello from pk");
//    }
//}
//
//
//interface ck extends Ak{
//    default void printHello(){
//        System.out.println("hello from ck");
//    }
//}
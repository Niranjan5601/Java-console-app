package Dummy;

import java.util.ArrayList;
import java.util.List;

class dummy2 extends boy {

//     public static void print() {
//         System.out.println("from dummy");
//     }

     public static void main(String[] args) {
         dummy2 t = new dummy2();
         t.print();
     }
 }


 class boy {
    // abstract  void getOut();
    public static void print() {
        System.out.println("from boi");
    }

    public  int print(int i) {
        return i;
    }

     public static void main(String[] args) {

     }


}

abstract class th {
    abstract void run();
    abstract class the{
        abstract void display();
    }
}
class demo extends th{
    public void display(){

    }

    @Override
    void run() {

    }
}

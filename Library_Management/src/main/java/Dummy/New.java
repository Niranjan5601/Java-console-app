package Dummy;

import java.util.ArrayList;

public class New {


    static {
    System.out.println("He;;p");
}
    public static void main(String... x) {

        ParentClass childClass = new ChildClass();

        childClass.print();
    }


}


class ParentClass{
    static void print(){
        System.out.println("parent");
    }
}

final class ChildClass extends ParentClass{
    static void print(){
        System.out.println("child");
    }
}


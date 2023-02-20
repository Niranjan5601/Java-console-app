package Dummy;

public class Henlo {

    public static void main(String[] args) {
        hfdgy h=new hfdgy();
        h.Display();
    }
}




abstract class hhbu{
    static void Display(){
        System.out.println("in a1");
    }
}
class hfdgy extends hhbu{
    static void Display(){
        System.out.println("in a2");
    }
}

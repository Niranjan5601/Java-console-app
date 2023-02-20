package Dummy;

public class Imple implements Manager{
    @Override
    public void updateManager() {
        System.out.println("Hi manager");
    }

    @Override
    public void updateMts() {
        System.out.println("Hi Mts");
    }

    @Override
    public void updatePt() {

    }
    //    @Override
//    public void updatePt() {
//        System.out.println("Hi Pt");
//    }

    public static void main(String[] args) {
        Manager a  = new Imple();
        a.updateManager();
        Pt.printhello();
    }
}

interface Manager  extends Mts,Pt {
    void updateManager();

    @Override
    void updatePt();

//    static void printhello(){
//        System.out.println("Hello from Manager");
//    }
}

interface Mts {
    void updateMts();
}
interface Pt{
    int a=10;
   void updatePt();
   static void  printhello(){
       System.out.println("hello from pt");
   }
}
package Dummy;

interface Music {
    static void music(){
        System.out.println("Music");
    }
}




abstract  class Vehicle  implements Music {
    static void music(){
        System.out.println("Music");
    }
   abstract void uCanDrive();
   static void howEngineWorks(){
       System.out.println("Engine goes bur bur or burrr burrr");
   }


}

class Car extends Vehicle{

    public void uCanBrake() {
        System.out.println("U stamp leaver to brake");
    }

    @Override
    public void uCanDrive() {
        System.out.println("U twist the steering ");
    }

    public static void howEngineWorks(){
        System.out.println("Engine goes  burrr burrr");
    }





}


class Run{
    public static void main(String[] args) {
        Vehicle v = new Car();
        Vehicle.howEngineWorks();
        v.uCanDrive();


    }
}

class Tryout
{




//    static {
//        a=10;
//    }

//    {
//        a=10;
//    }

//    Tryout() {
//        a=10;
//    }

    final static int add(int a ,int b){
        a = 10;
        return a+b;
    }


    final static int add(double a,double b){
        int c = (int) (a+b);
        return c;
    }
}







//public class Inter {
//    public static void main(String[] args) {
//        Vehicle v = new Car();
//        v.uCanBrake();
//        v.uCanDrive();
//        Tryout t = new Tryout();
//       int c = t.add(4,5);
//        System.out.println(c);
//    }
//}

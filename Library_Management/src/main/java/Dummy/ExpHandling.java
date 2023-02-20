package Dummy;



public class ExpHandling {


    ExpHandling() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws Exception  {
        Check c = new Check();

       int ans = c.test();
        System.out.println(ans);
//        try {
//
//            // ExpHandling e = new ExpHandling();
//        }
//        catch (Exception e){
//            System.out.println("Handled");
//        }
//        finally {
//
//            System.out.println("sdad");
//        }



//        try{
////            System.out.println("Hello");
////            throw new Exception();
//            c.Print();
//
//
//        }
//        finally {
//
//        }
//        catch (Exception e){
//           // System.out.println("Handled");
//        }
//        catch (Exception e ){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Henlo");
//        }
    }
}


class Check{
public static int a;

public void Print() throws Exception{

    throw  new ArithmeticException("Broo dont divide by zero");

    }
    public int test(){
        try{
           return 1;
        }
        catch (Exception e){
            System.out.println("catch");
        }

        finally {
            System.out.println("finally");
        }

        return 0;
    }

}
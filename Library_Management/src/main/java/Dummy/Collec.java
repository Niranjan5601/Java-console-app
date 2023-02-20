package Dummy;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class Collec implements Runnable {

    static Properties v = new Properties();
    static Vector<Integer> a= new Vector<>();
   static ConcurrentHashMap ta = new ConcurrentHashMap();
   PriorityQueue<Integer> p = new PriorityQueue<>( );



    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        //System.out.println("ta "+ta);

        ta.put(1,"adasd");
        ta.put(2,"dad");
        ta.put("3","adaaadadwasd");
        ta.put("4","kkiif");

        Collec c = new Collec();
        Thread t = new Thread(c);
       t.start();

        Enumeration it = v.elements();
//        while (it.hasMoreElements()){
//            v.forEach((k,v) - > );
//        }
       // System.out.println("a "+a);
       // ta.forEach((key,value)-> System.out.println(value));
//        for (Object l:ta.keySet()){
//            System.out.println( l+" "+ta.get(l));
//        }


        Iterator<Map.Entry<Integer, String>> new_Iterator
                = ta.entrySet().iterator();

        // Iterating every set of entry in the HashMap
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, String> new_Map
                    = (Map.Entry<Integer, String>)
                    new_Iterator.next();

            // Displaying HashMap
            System.out.println(new_Map.getKey() + " = "
                    + new_Map.getValue());
        }

      //  final Enumeration<Object> strEnum = Collections.enumeration(ta.keySet());




//        for(Object a:v.keySet()){
//            System.out.println(v.get(a));
//        }
       // System.out.println(v);
//
//        v.add(16);
//        v.add(15);
//        v.add(100);
//        v.add(60);
//        while (it.hasMoreElements()){
//            System.out.println(it.nextElement());
//        }


    }
    public void run() {

        System.out.println(Thread.currentThread().getName());
//        v.put(null,"");
//        v.put("ghgf","");
        ta.put("6","ada");
        ta.put("7","acdcc");
        ta.put("8","cac");
        ta.put("9","rrfef");
    }
}

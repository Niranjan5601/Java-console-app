package Dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ImpleCollec {

    static HashMap ta = new HashMap();
static ArrayList  a= new ArrayList();
    public static void main(String[] args) {
        ta.put(1,"adasd");
        ta.put(2,"dad");
        ta.put("3","adaaadadwasd");
        ta.put("4","kkiif");

        a.add(10);
        a.add("djad");
        a.add(true);
        for(Object c:a){
            System.out.println(c.getClass().getName());
        }
       // System.out.println(a);

       // ta.forEach((k,v)-> System.out.println(v));
//        for(Object a:ta.keySet()){
//            System.out.println(a+" "+a.getClass().getName());
//        }
    }
}

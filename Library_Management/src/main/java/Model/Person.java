package Model;

import Database.Db;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Person {
    private int user_id;
    private String user_mail;
    private  String user_password;
    private String user_address;
    private String user_ph;
    private boolean is_admin;

    public static boolean login(){

        System.out.println("-------LOGIN------");
        Scanner sc = new Scanner(System.in);
        String u_name,u_password;
        System.out.println("Enter user name");
        u_name= sc.nextLine();
        System.out.println("Enter password");
        u_password = sc.nextLine();
        Connection conn = Db.getConnection();
        boolean is_admin_or_not = false ;
        String query;
      try  {
            String user_name,user_password;
            Statement st =  conn.createStatement();
        query = "SELECT * FROM USERS WHERE IS_ADMIN = TRUE";
          ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                user_name = rs.getString("USERNAME");
                user_password = rs.getString("USR_PASSWORD");

                if (user_name.equals(u_name) && user_password.equals(u_password)){
                    return true;
                }
            }

        }
      catch(Exception e){

      }



    return is_admin_or_not;
    }


}

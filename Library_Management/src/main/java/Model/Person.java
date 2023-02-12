package Model;

import Database.Db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Person {
  public static String user_id;
    public  static String user_name;
    private String user_mail;
    private  String user_password;
    private String user_address;
    private String user_ph;
    public static int is_admin;

    Person(){}
    Person(String user_id,String user_name,int is_admin){
        this.user_id = user_id;
        this.user_name = user_name;
        this.is_admin = is_admin;

    }


    private static  Connection conn = Db.getConnection();
    public static Person login(){

        System.out.println("-------LOGIN------");
        Scanner sc = new Scanner(System.in);
        String u_name,u_password;
        System.out.println("Enter user name");
        u_name= sc.nextLine();
        System.out.println("Enter password");
        u_password = sc.nextLine();

        String query;
        String user_name=null,user_password=null,user_id=null;
        int user_is_admin;
      try  {

            Statement st =  conn.createStatement();
        query = "SELECT * FROM USERS";
          ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                user_id =rs.getString("UID");
                user_name = rs.getString("USERNAME");
                user_password = rs.getString("USR_PASSWORD");
                user_is_admin = Integer.parseInt(rs.getString("IS_ADMIN"));

                if (user_name.equals(u_name) && user_password.equals(u_password)){
                   return new Person(user_id,user_name,user_is_admin);
                }
            }


        }
      catch(Exception e){

      }

        return new Person(null,null,-1);
    }


    public static void listAllBooks(){
        try{
            String book_id,book_name,book_genre,book_price,book_qty;
            Statement st =  conn.createStatement();
            String  query = "SELECT * FROM BOOKS";
            ResultSet rs = st.executeQuery(query);
            System.out.println("--------------------------------------------------");
            System.out.println("| book_id |\tbook_name|\tbook_genre |");
            while(rs.next()){
                book_id = rs.getString("BID");
                book_name = rs.getString("BNAME");
                book_genre  = rs.getString("GENRE");
                System.out.println("|\t"+book_id+"\t|\t"+book_name+"\t|\t"+book_genre+" |");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("--------------------------------------------------");
    }
    public static boolean  addUser(String name , String password,String privilege){
        try{
            Statement st =  conn.createStatement();
            String query = "INSERT INTO USERS(USERNAME, USR_PASSWORD, IS_ADMIN) VALUES('"+name +"'," + "'" +password+"',"+privilege +")";
            st.executeUpdate(query);
            st.close();
            return true;

        }catch(Exception e){
            System.out.println(e);
        }

        return false;
    }

}

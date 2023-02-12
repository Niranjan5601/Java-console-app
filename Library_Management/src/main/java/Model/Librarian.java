package Model;

import Database.Db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Librarian extends Person {


  static Connection conn = Db.getConnection();
  public static boolean  addBooks(String title,String genre,int price){
    try{
      Statement st =  conn.createStatement();
      String query = "INSERT INTO BOOKS(BNAME, GENRE, PRICE) VALUES('"+title +"'," + "'" +genre+"',"+price+")";
      st.executeUpdate(query);
      st.close();
      return true;

    }catch(Exception e){
      System.out.println(e);
    }
//INSERT INTO BOOKS(BNAME, GENRE, PRICE) VALUES ('War and Peace', 'Mystery', 200)
    return false;
  }

  public static void  editBook(){}
  public static boolean editUser(int user_id){


    try {
      Statement st = conn.createStatement();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter user id :");
      int userid = user_id;
      String query = "SELECT * FROM USERS WHERE UID="+user_id;
      ResultSet rs = st.executeQuery(query);
      while (rs.next()){
        user_id =Integer.parseInt(rs.getString("UID"));
        user_name = rs.getString("USERNAME");
        System.out.println(user_id+" "+user_name);

      }

      return true;


    }
    catch (Exception e){

    }

return false;

  }

//UPDATE Customers
//SET ContactName = 'Alfred Schmidt', City = 'Frankfurt'
//WHERE CustomerID = 1;
  public static void  listUsers(){

    try{
      Statement st =  conn.createStatement();
      String query = "SELECT * FROM USERS WHERE IS_ADMIN=0 ";
      ResultSet rs = st.executeQuery(query);
      System.out.println("-------------------------------------------");
      while(rs.next()){
        user_id =rs.getString("UID");
        user_name = rs.getString("USERNAME");
        System.out.println(user_id+" "+user_name);
      }
      rs.close();

    }catch(Exception e){

    }
    System.out.println("-------------------------------------------");


  }
   public static void deleteUser(){}
  public static void  listAllBorrowedBooks(){}
  public static void  listAllReturnedBooks(){}
  public static void  deleteBooks(){}
  public static void  editLibrarian(){}
  public static void  addLibrarian(){}
  public static void  deleteLibrarian(){}
}

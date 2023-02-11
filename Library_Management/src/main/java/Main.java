import Database.Db;
import Model.Person;
import View.LibrarianView;
import View.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Library Management--------");

        Person.login();
      if (Person.is_admin == 1){

          LibrarianView.librarianView();
      }
      else if(Person.is_admin == 0) {
          UserView.userView();
      }
      else{
          System.out.println("User not available");
      }


    }
}
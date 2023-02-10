import Database.Db;
import Model.Person;
import View.LibrarianView;
import View.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Db.createConnection();
        int choice;
        boolean flag = true;
        System.out.println("--------Library Management--------");
//while(flag){
//    System.out.println("Enter Choice");
//    System.out.println("1.User");
//    System.out.println("2.Librarian");
//    System.out.println("3.Exit");
//   choice = Integer.parseInt(sc.next());
//    switch(choice){
//        case 1:
//            UserView.userView();
//            break;
//        case 2:
//            LibrarianView.librarianView();
//            break;
//        case 3:
//            flag = false;
//            break;
//
//    }
//}
      if (Person.login()){

          LibrarianView.librarianView();
      }
      else {
          UserView.userView();
      }


    }
}
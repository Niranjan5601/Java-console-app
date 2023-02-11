package View;

import Model.Person;
import Model.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserView {


    public static void userView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome " + Person.user_name + "-----");
        System.out.println("Enter Choice");


        boolean flag = true;
        while (flag) {
            System.out.println("1.List All Books");
            System.out.println("2.Borrow Book");
            System.out.println("3.View Your Borrowed Books");
            System.out.println("4.Return Book");
            System.out.println("5.Exit");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    Person.listAllBooks();
                    break;
                case 2:
                    User.borrowBook();
                    break;
                case 3:
                    User.viewBorrowedBooks();
                    break;
                case 4:
                    User.returnBooks();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
//            }


            }
        }
    }
}

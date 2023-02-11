package View;

import Model.Person;
import Model.User;

import java.util.Scanner;

public class LibrarianView {

    public static void librarianView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome " + Person.user_name + "-----");
        System.out.println("Enter Choice");


        boolean flag = true;
        while (flag) {
            System.out.println("List all the users ");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
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

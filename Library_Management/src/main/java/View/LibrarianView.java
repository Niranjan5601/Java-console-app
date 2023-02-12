package View;

import Database.Db;
import Model.Librarian;
import Model.Person;
import Model.User;

import java.sql.Connection;
import java.util.Scanner;

public class LibrarianView {
 static   Connection conn = Db.getConnection();

    public static void librarianView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome " + Person.user_name + "-----");
        System.out.println("Enter Choice");


        boolean flag = true;
        while (flag) {
            System.out.println("1.List all the users ");
            System.out.println("2.Add a user");
            System.out.println("3.Edit a user");
            System.out.println("4.Delete a user");
            System.out.println("5.Add a librarian");
            System.out.println("6.Edit a librarian");
            System.out.println("7.Delete a librarian");
            System.out.println("8.List all books");
            System.out.println("9.List all borrowed books");
            System.out.println("10.List all returned books");
            System.out.println("11.Add a book");
            System.out.println("12.Edit a book");
            System.out.println("13.Delete a book");
            System.out.println("14.Exit");

            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    Librarian.listUsers();
                    break;
                case 2:
                    View.addUserLibrarianView();
                    break;
                case 3:
                    View.editUserLibrarianView();
                    break;
                case 4:
                    Librarian.deleteUser();
                    break;
                case 5:
                   Librarian.addLibrarian();
                    break;
                case 6:
                    Librarian.editLibrarian();
                    break;
                case 7:
                    Librarian.deleteLibrarian();
                    break;
                case 8:
                    Person.listAllBooks();
                    break;
                case 9:
                    Librarian.listAllBorrowedBooks();
                    break;
                case 10:
                    Librarian.listAllReturnedBooks();
                    break;
                case 11:
                    View.addBookView();
                    break;
                case 12:
                    Librarian.editBook();
                    break;
                case 13:
                    Librarian.deleteBooks();
                    break;
                case 14:
                    flag = false;
                   try{
                       conn.close();
                   }
                   catch (Exception e){
                       System.out.println("Unable to close connection");
                   }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
//            }


            }
        }
    }
}

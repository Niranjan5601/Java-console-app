package View;

import Model.Librarian;

import java.sql.Struct;
import java.util.Scanner;

public class View {



    public static void addUserLibrarianView(){
        String name;
        String password;
        String privilege;
        Scanner sc = new Scanner(System.in);
        System.out.println("------- ADD USER ----------");
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.println("Enter password for user");
        password = sc.nextLine();
        System.out.println("Privilege - 0(USER) - 1(LIBRARIAN) :");
        privilege  = sc.nextLine();
       boolean result =  Librarian.addUser(name,password,privilege);

       if (!result){
           System.out.println("User creation failed");
       }
       else {
           System.out.println("User creation success");
       }



    }

    public static void editUserLibrarianView(){

    }


    public static void addBookView(){
        Scanner sc = new Scanner(System.in);
        String title ;
        String genre;
        int price;
        System.out.println("-----ADD BOOK-----");
        System.out.print("Enter Title: ");
        title=sc.nextLine();
        System.out.print("Enter Genre: ");
        genre = sc.nextLine();
        System.out.print("Enter Price: ");
        price = Integer.parseInt(sc.next());
        boolean result = Librarian.addBooks(title,genre,price);

        if (result){
            System.out.println("Book added success fully");
        }
        else {
            System.out.println("Book adding failed");
        }
    }

}

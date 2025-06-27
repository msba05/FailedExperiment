
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryT2 {

    String[] bookArray = new String[5];
    int bookCount = 0;
    
    ArrayList<String> bookList = new ArrayList<>();
    ArrayList<String> genreList = new ArrayList<>();

public static void main(String[] args) {
    Scanner kbd = new Scanner (System.in);
    boolean run = true;
    
    while (run){
    System.out.println("Welcome to the Book Invenrtory System Menu"
            + ", Please choose the corresponding number for your choice below.");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("1. Display by book titles.");
    System.out.println("2. Add book titles.");
    System.out.println("3. Remove book titles.");
    System.out.println("4. Search by title");
    System.out.println("5. Display by genre");
    System.out.println("6. Search by genre");
    System.out.println("0. Exit");
    
    kbd.nextLine();
    run = menuSelection(kbd);
    }
    kbd.close();
    
    }

static boolean menuSelection(Scanner kbd){
    int choice = kbd.nextInt();
    
    /*   
    switch (choice){
        case 1:
            System.out.println("Add book title: ");
        String title = kbd.nextLine();
            System.out.println("Add genre for this book: ");
        String genre = kbd.nextLine();
            dynamicInventory.addTitleAndGenre(title, genre);
            System.out.println("Successfully added!");
        break;
        case 2: 
            System.out.println("Search book title: ");
        String title = kbd.nextLine();
            dynamicInventory.SearchTitle(title);
            System.out.println("Successfully added!");
            break;
        case 3: 
            System.out.println("Search book genre: ");
        String genre = kbd.nextLine();
            dynamicInventory.SearchByGenre(genre);
            System.out.println("Successfully added!");
            break;
        case 4: 
            System.out.println(Remove book title: );
        String title = kbd.nextLine();
            dynamicInventory.removeBook(title);
            System.out.println("Successfully removed!");
            break;
        case 5: 
            System.out.println(Display books by genre: );
        String genre = kbd.nextLine();
            dynamicInventory.displayGenre(genre);
            break;
        case 6: 
            System.out.println(Display books);
            dynamicInventory.displayBooks();
            break;
        case 0: 
            System.out.println("Exiting System. Goodbye.");
            return false;
        default:
            System.out.println("Invalid Option. Try Again.");
    }
    */ return true;
     }
    
}




/**
 * @author Trevor Sanderson, Mariam Barry, & Brayden Stewart
 * date 6/27/2025
 * ArrayLists Vs. Arrays -> In AI training projects, arrays and ArrayLists are tools used to store data,
 * but they work best in different situations. Arrays are good when you know exactly how much data you have,
 * like when dealing with images that are always the same size. They’re fast and don’t use much memory,
 * but you can’t easily change their size. On the other hand, ArrayLists are better when the amount of data can change,
 * like collecting sentences from websites or adding new training examples.
 * They’re easier to work with because you can add or remove items without worrying about size,
 * but they can be a bit slower. Basically, use arrays for fixed data and ArrayLists for flexible changing data.
 **/

import java.util.Scanner;
public class LibraryT2
{

    public static void main(String[] args)
    {
        DynamicBookStorage dynamicInventory = new DynamicBookStorage();
        Scanner kbd = new Scanner(System.in);
        boolean run = true;
        int choice;

        while (run)
        {

            System.out.println("\nWelcome to the Book Inventory System Menu"
                    + ", Please choose the corresponding number for your choice below.");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("[Press Enter to continue]");
            kbd.nextLine();
            System.out.println("1. Add book titles.");
            System.out.println("2. Search by title.");
            System.out.println("3. Search by genre.");
            System.out.println("4. Remove Book");
            System.out.println("5. Display by genre");
            System.out.println("6. Display Books");
            System.out.println("0. Exit");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    kbd.nextLine();
                    System.out.println("Add book title: ");
                    String title = kbd.nextLine();
                    System.out.println("Add genre for this book: ");
                    String genre = kbd.nextLine();
                    dynamicInventory.addTitleAndGenre(title, genre);
                    System.out.println("Successfully added!");
                    break;
                case 2:
                    kbd.nextLine();
                    System.out.println("Search book by title: ");
                    String searchTitle = kbd.nextLine();
                    dynamicInventory.searchTitle(searchTitle);
                    break;
                case 3:
                    kbd.nextLine();
                    System.out.println("Search book genre: ");
                    String genreSearch = kbd.nextLine();
                    dynamicInventory.searchByGenre(genreSearch);
                    break;
                case 4:
                    kbd.nextLine();
                    System.out.println("Remove book title: ");
                    String removeTitle = kbd.nextLine();
                    dynamicInventory.removeBook(removeTitle);
                    System.out.println("Successfully removed!");
                    break;
                case 5:
                    kbd.nextLine();
                    System.out.println("Enter book Genre");
                    String displayGenre = kbd.nextLine();
                    dynamicInventory.displayGenre(displayGenre);
                    break;
                case 6:
                    dynamicInventory.displayBooks();
                    break;
                case 0:
                    System.out.println("Exiting System. Goodbye.");

                default:
                    System.out.println("Invalid Option. Try Again.");
            }
        }
    }
}

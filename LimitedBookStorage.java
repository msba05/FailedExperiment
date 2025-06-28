import java.util.Scanner;

public class LimitedBookStorage extends LibraryT2{
    private String[] titles = new String[5];
    private int count = 0;
    Scanner kbd = new Scanner(System.in);
         

        public void addBook(String title) {
            if(count < titles.length){
                titles[count] = title;
                count++;
                System.out.println("Book added: " + title);
            } else {
            System.out.println("Inventory is full, Cannot add more books");
            }
        }
        
        public void displayBooks(){
            System.out.println("\nBook Inventory: ");
                for(int i = 0; i < count; i++){
                    System.out.println((i+1)+". " + titles[i]);
                }
                if (count == 0) {
                System.out.println("No books in stock.");
            }
        }
        
        public int searchTitle(String title)
        {
            for (int i = 0; i < titles.length; i++) {
                if (titles[i].equals(title)) {
                    return (i+1);
                }
            }
            return 1;
        }
        
        

}

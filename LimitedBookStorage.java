import java.util.Scanner;

public class LimitedBookStorage 
{
         private String[] titles = new String[5];
         private int titleCount = 0;
         Scanner kbd = new Scanner(System.in);
         String choice;

         public void main(String[] args) {
        
                  for(int i = 0; i < 5; i++){
                     System.out.println("Enter a book title: ");
                     choice = kbd.nextLine();
                     addTitle(choice);
                  }
                     displayTitles();
          }   

  

        public void addTitle(String title)
        {

            if (titleCount < titles.length) {
                titles[titleCount] = title;
                titleCount++;
            }
            else
            {
                System.out.println("Book collection is full. Cannot add more books.");
            }
        }

        public void displayTitles()
        {
            System.out.println("Book Titles:");
            for (int i = 0; i < titleCount; i++) {
                System.out.println((i + 1) + ". " + titles[i]);
            }
        }

        public int searchTitle(String title)
        {
            for (int i = 0; i < titleCount; i++) {
                if (titles[i].equalsIgnoreCase(title)) {
                    return i;
                }
            }
            return 0;
        }
}


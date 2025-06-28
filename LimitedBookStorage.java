
 public class LimitedBookStorage extends LibraryT2
{
         private String[] titles = new String[]{"Lord of The flies","Harry Potter and the Sorcerer's Stone","The Hunger Games","Divergent","Maze Runner"};
         private int titleCount = 0;




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


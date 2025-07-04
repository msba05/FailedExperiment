import java.util.ArrayList;
public class DynamicBookStorage extends LibraryT2
{
    private ArrayList<String> bookTitle = new ArrayList<>();
    private ArrayList<String> bookGenre = new ArrayList<>();
    public void addTitleAndGenre(String title, String genre)
    {
        bookTitle.add(title);
        bookGenre.add(genre);
    }
    public void removeBook(String title)
    {
        int index = bookTitle.indexOf(title);
        if(index != -1)
        {
            bookTitle.remove(index);
            bookGenre.remove(index);
            System.out.println("Book was removed successfully!");
        }
        else
        {
            System.out.println("Book can't be found.");
        }
    }
    public void displayBooks()
    {
        if(bookTitle.isEmpty())
        {
            System.out.println("No books in Dynamic storage");
        }
        else
        {
            System.out.println("Book titles: ");
            for (int i=0;i<bookTitle.size();i++)
            {
                System.out.println("~"+bookTitle.get(i)+"("+bookGenre.get(i)+")");
            }
        }
    }
    public void searchTitle(String title) //method to search for book titles
    {
        int index = bookTitle.indexOf(title);
        if(index != -1) {
            System.out.println("Book found: " + bookTitle.get(index) + "(" + bookGenre.get(index) + ")");
        }
        else{
            System.out.println("Book not found.");
        }
    }
    public void displayGenre(String genre) //method to display gnere user inputs
    {
        System.out.println("Books in genre ~" +genre+"~");
        boolean found=false;
        for(int i=0; i<bookGenre.size(); i++)
        {
            if(bookGenre.get(i).equalsIgnoreCase(genre))
            {
                System.out.println("~"+bookTitle.get(i));
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("No books found for that genre.");
        }
    }
    public void searchByGenre(String genre)
    {
        displayGenre(genre);
    }
}
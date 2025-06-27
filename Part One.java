/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package team.assignment.pkg1;

public class TeamAssignment1 {
    static String[] titles = new String[5];
    static int titleCount = 0;

    public static void main(String[] args) {
        int positionOne;
        int positionTwo;
        
        addTitle("Book One");
        addTitle("Book Two");
        addTitle("Book Three");
        addTitle("Book Four");
        addTitle("Book Five");
        addTitle("Book Six"); // Test
        
        displayTitles();
        
        positionOne = searchTitle("Book eight");
        positionTwo = searchTitle("Book four");
        
        System.out.println("Books search test: " + titles[positionOne] + ", " + titles[positionTwo]);
    }

    public static void addTitle(String title) {
        if (titleCount < titles.length) {
            titles[titleCount] = title;
            titleCount++;
        } else {
            System.out.println("Book collection is full. Cannot add more books.");
        }
    }
    
    public static void displayTitles() {
        System.out.println("Book Titles:");
        for (int i = 0; i < titleCount; i++) {
            System.out.println((i + 1) + ". " + titles[i]);
        }
    }
    
    public static int searchTitle(String title) {
        for (int i = 0; i < titleCount; i++) {
            if (titles[i].equalsIgnoreCase(title)) { 
                return i;
            }
        }
        return 0;
    }
}
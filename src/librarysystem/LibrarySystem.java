package librarysystem;

import java.util.*;

public class LibrarySystem {
    static Scanner cin = new Scanner(System.in);
    static ArrayList<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        menu(); 
    }

    public static void menu() {
        boolean running = true;
      
        String[] menuOptions = {"1. Add a book", "2. View All Books", "3. Check Out A Book", "4. Return A Book", "5. Quit"};

        while (running){
            System.out.println("----------------MAIN MENU-----------------");
            for (String option : menuOptions) {
                System.out.println(option);
            }
            
            System.out.print("Enter your choice: ");
            int choice = cin.nextInt();
            cin.nextLine();

            switch (choice) {
                case 1 -> {
                    addABook(library, cin);
                    System.out.println("Adding a book...");
                }
                case 2 -> {
                    viewBooks(library);
                }
                case 3 -> {
                    checkOutBook(library, cin);
                }
                case 4 -> {
                    returnBook(library, cin);
                }
                case 5 -> {
                    running = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    
    public static void addABook(ArrayList<Book> library, Scanner cin){  
        System.out.println("------------ADD A BOOK!!------------");

        System.out.print("Book Title: ");
        String title = cin.nextLine(); 

        System.out.print("Book Author: "); 
        String author = cin.nextLine(); 

        Book newBook = new Book(title, author);
        
        library.add(newBook);

        System.out.println("Book added successfully!");
    }
    
    public static void viewBooks(ArrayList<Book> library){
        System.out.println("-------------VIEW ALL BOOKS-----------------");      
            if (library.isEmpty()) {
                System.out.println("The library is currently empty.");
        } else {
                for(Book books:library){
                System.out.println(books);
              }
        }
    }
    
    public static void checkOutBook(ArrayList<Book> library, Scanner cin){
        System.out.println("--------------CHECK OUT A BOOK-------------------");
        System.out.print("Book title: ");
        String searchTitle = cin.nextLine();
        boolean found = false;
        
        for(Book book: library){
            if (book.getTitle().equalsIgnoreCase(searchTitle)){
                if(book.isCheckedOut()){
                    System.out.println("Book unavailable! Please choose another book!"); 
                }
                else{
                    book.checkOut();
                    System.out.println("Success! You checked out " + book.getTitle());
                             
                }
                found = true;  
                break;
            }
        }
        
        if(!found){
            System.out.println("Error: Book cannot be found!");
        }
        
    }
    
    public static void returnBook(ArrayList<Book> library, Scanner cin){
        System.out.println("--------------RETURN A BOOK-----------------");
        System.out.print("Book title: ");
        String searchTitle = cin.nextLine();
        boolean found = false;
        
        for(Book book: library){
            if (book.getTitle().equalsIgnoreCase(searchTitle)){
                if (book.isCheckedOut()){
                    book.returnBook();
                    System.out.println("Book returned successfully! Title: " + book.getTitle());
                }
                else{
                    System.out.println("That book is already in the library!");
                }
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Error: Book cannot be found!");
        }
    }
}
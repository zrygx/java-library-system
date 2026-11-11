package librarysystem;

public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;
    
    public Book (String title, String author){
        this.author = author;
        this.title = title;
        isCheckedOut = false;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public boolean isCheckedOut(){
        return isCheckedOut;
    }
    
    void checkOut(){
        this.isCheckedOut = true;
    }
    
    void returnBook(){
        this.isCheckedOut = false;
    }
    
    @Override
    public String toString() {
        String status = isCheckedOut ? "[Checked out]" : "[Available]";
        return getTitle() + " by " + getAuthor() + " " + status;
    }
    
}

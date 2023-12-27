public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    private Object[] title;

    public void addBook(Book book, int slot){
        if (slot == 1){
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        }
    }
    public void removeBook(int slot){
        if (slot == 1){
            book1 = null;
        } else if (slot == 2) {
            book2 = null;
        } else if (slot == 3) {
            book3 = null;
        }
    }
    public void printLibraryDetails(){ 
        System.out.println("Library: " + libraryName);
        System.out.println("Title: ");
        System.out.println("Author: " + book1.author);
        System.out.println("Publisher: " + book1.publisher);
        System.out.println("Year Published: " + book1.yearPublished);
        System.out.println("Price: $" + book1.price);
        System.out.println("Available: " + book1.isAvailable);   
    }
    public void checkBookAvailability(int slot){
        
    }
    public void updateBookPrice(int slot, double newPrice){
        
    }
    public void printBookDetails(Book book){
        
    }
}

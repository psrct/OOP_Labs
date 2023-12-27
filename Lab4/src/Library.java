public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

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
        System.out.println();
        printBookDetails(book1);
        System.out.println();
        printBookDetails(book2);
        System.out.println();
        printBookDetails(book3);
    }
    public void checkBookAvailability(int slot){
        switch(slot){
            case 1:
                if (book1 != null) {
                    System.out.println(book1.title + "is available.");
                } else {
                    System.out.println(book1.title + "is not available.");
                } break;
            case 2:
                if (book2 != null) {
                    System.out.println(book2.title + "is available.");
                } else {
                    System.out.println(book2.title + "is not available.");
                } break;
            case 3:
                if (book3 != null) {
                    System.out.println(book3.title + "is available.");
                } else {
                    System.out.println(book3.title + "is not available.");
                } break;
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        switch(slot){
            case 1:
                if (book1 != null) {
                    book1.updatePrice(newPrice);
                    System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                } break;
            case 2:
                if (book2 != null) {
                    book2.updatePrice(newPrice);
                    System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                } break;
            case 3:
                if (book3 != null) {
                    book3.updatePrice(newPrice);
                    System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                } break;
        }
    }
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
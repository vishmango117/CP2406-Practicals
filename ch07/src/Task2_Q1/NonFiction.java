package Task2_Q1;

/*CP2406-Programming-III
Task 2 Q1*/
// Nonfiction class extends from Task2_Q1.Book class
public class NonFiction extends Book {
    public NonFiction(String book_title) {
        super(book_title);
    }
    //Method override to set price for non-fiction book
    @Override
    public void setBook_price() {
        this.book_price=37.99;
    }
}

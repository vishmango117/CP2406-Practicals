/*CP2406-Programming-III
Task 2 Q1*/
package Task2_Q1;


abstract public class Book {
    //Instance Variables
    private String book_title;
    protected double book_price;

    //Constructor
    public Book(String book_title) {
        this.book_title = book_title;
        this.book_price = 0.0;
    }
    // Getters and Setters
    public String getBook_title() {
        return book_title;
    }

    public double getBook_price() {
        return book_price;
    }

    //Abstract method to setbook_price
    public abstract void setBook_price();
}


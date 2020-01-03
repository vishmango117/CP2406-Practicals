package Task2_Q1;/*CP2406-Programming-III
Task 2 Q1*/

public class Fiction extends Book {

    public Fiction(String book_title) {
        super(book_title);

    }
    //Override method and setprice for fiction books
    @Override
    public void setBook_price() {
        this.book_price=24.99;
    }


}

package Task2_Q1;/*CP2406-Programming-III
Task 2 Q1*/

import java.util.ArrayList;

// Class to show Array of Books in Task2_Q1.Fiction and Nonfiction categories
public class BookArray {
    public static void main(String[] args) {
        String[] non_fic = new String[] {"Joey", "Keith", "Jianwei", "Kyle", "Mengying"};
        ArrayList<Book> book_list = new ArrayList<>();
        for(int i=0;i<5;i++) {
            book_list.add(new NonFiction(non_fic[i]+"An Autobiography"));
        }
        String[] fic_list = new String[] {"Brief History of Time", "Confidence 2.0","Hitchikers Guide to the Galaxy", "Mein Kampff","Hello World"};
        for(int i=0;i<5;i++) {
            book_list.add(new Fiction(fic_list[i]));
        }
        for(Book currentBook: book_list) {
            System.out.printf("Task2_Q1.Book Information(%s)\nTask2_Q1.Book Name: %s\nTask2_Q1.Book Price:%s\n",currentBook.getClass(), currentBook.getBook_title(),currentBook.getBook_price());
        }
    }
}

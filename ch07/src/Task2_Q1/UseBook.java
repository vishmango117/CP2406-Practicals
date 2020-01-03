package Task2_Q1;/*CP2406-Programming-III
Task 2 Q1*/

public class UseBook {
    // Main Method
    public static void main(String[] args) {
        Fiction myfictionbook = new Fiction("Memories of Alhambra");
        NonFiction my_nonfiction_book = new NonFiction("Confidence 2.0");
        System.out.printf("Task2_Q1.Book Information(Task2_Q1.Fiction)\nTask2_Q1.Book Name: %s\nTask2_Q1.Book Price:%s\n", myfictionbook.getBook_title(),myfictionbook.getBook_price());
        System.out.println();
        System.out.printf("Task2_Q1.Book Information(Non Task2_Q1.Fiction)\nTask2_Q1.Book Name: %s\nTask2_Q1.Book Price:%s\n", my_nonfiction_book.getBook_title(),my_nonfiction_book.getBook_price());
    }
}

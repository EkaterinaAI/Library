import java.util.Scanner;

public class Main {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            addBook(inputBookName(), inputPageCount());
            printInfo();
        }
    }

    public static int inputPageCount() {
        System.out.println("Введите количество страниц");
        return new Scanner(System.in).nextInt();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги");
        return new Scanner(System.in).nextLine();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. \n";
    }
    public static void printInfo() {
        System.out.println(booksInfo);
    }
}

class Book {
    String title;
    String author;
}

public class ArrayDemo5 {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        books[0].title = "C";
        books[1].title = "Java";
        books[2].title = "HTML";

        books[0].author = "Denis";
        books[1].author = "James";
        books[2].author = "Tim";

        int index = 0;
        while (index < books.length) {
            System.out.print(books[index].title);
            System.out.print(" by ");
            System.out.println(books[index].author);
            index++;
        }
    }
}

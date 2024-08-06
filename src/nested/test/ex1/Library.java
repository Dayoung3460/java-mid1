package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if(bookCount >= books.length) {
            System.out.println("over the max size.");
            return;
        }

        books[bookCount] = new Book(title, author);
        bookCount++;
    }

    public void showBooks() {
        System.out.println("=== Book List ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("book title: " + books[i].title + " author: " + books[i].author);
        }
    }

    // Book 클래스가 외부에 노출안되게 private
    // Book이 외부클래스의 멤버들을 사용하면 그냉 내부 클래스로 하면되는데
    // 안할 것 같아서(Library와는 별개의 클래스) static으로 설정
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}

package outer;
// Library.java
public class Library {
    private Book[] books;
    private int count = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
        }
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println("제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    // 정적 중첩 클래스
    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
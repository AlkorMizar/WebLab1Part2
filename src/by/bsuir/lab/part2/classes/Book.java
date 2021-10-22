package by.bsuir.lab.part2.classes;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return price == book.price &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    protected Object clone() {
        var obj=new Book();
        obj.author=this.author;
        obj.title=this.title;
        obj.price=this.price;
        return obj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public int compareTo(Book o) {
        return isbn-o.isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
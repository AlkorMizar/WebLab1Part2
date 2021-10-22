package by.bsuir.lab.part2.classes.bookComparator;

import by.bsuir.lab.part2.classes.Book;

import java.util.Comparator;

public class BookComparatorByPrice implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        return book.getPrice()-t1.getPrice();
    }
}

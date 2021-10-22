package by.bsuir.lab.part2.classes.bookComparator;

import by.bsuir.lab.part2.classes.Book;

import java.util.Comparator;

public class ComparatorByTitleThenAuthorThenPrice implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        Comparator<Book> comparator = new BookComparatorByTitle()
                                          .thenComparing(new BookComparatorByAuthor())
                                          .thenComparing(new BookComparatorByPrice());
        return comparator.compare(book, t1);
    }
}

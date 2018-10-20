package com.tech.wsoft;


import com.sun.javafx.binding.StringFormatter;

public class BookPersistence {

    public void save(Book book) {
        System.out.println(StringFormatter.format("Saving the book %1s, %2s", book.getAuthorName(), book.getNoOfpages()).getValue());
    }
}

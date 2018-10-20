package com.tech.wsoft;

public class Book implements BookHandler {

    private int noOfpages;
    private String authorName;
    private BookPersistence mBookPersistence;


    public Book(String authorName, int noOfpages) {
        this.noOfpages = noOfpages;
        this.authorName = authorName;
        this.mBookPersistence = new BookPersistence();
    }

    public int getNoOfpages() {
        return noOfpages;
    }

    public void setNoOfpages(int noOfpages) {
        this.noOfpages = noOfpages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void save() {
        this.mBookPersistence.save(this);
    }

    @Override
    public void print() {
        System.out.println("Print");
    }
}

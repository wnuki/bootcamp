package com.bootcamp.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountain",
                2003, "01"));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams",
                2012, "02"));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven",
                2001, "03"));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the night",
                2015, "04"));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kings",
                2007, "05"));
        theBookList.add(new Book("Madelynn Carson", "Unity without duty",
                2007, "06"));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity",
                2009, "07"));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
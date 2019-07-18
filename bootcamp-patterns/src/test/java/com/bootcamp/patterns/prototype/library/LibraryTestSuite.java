package com.bootcamp.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBook() {
        // Given
        Library library = new Library("Biblioteka");
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Mikrotyki", "Paweł Sołtys", LocalDate.of(2017, 10, 05));
        Book book2 = new Book("Miedzianka", "Filip Springer", LocalDate.of(2010, 5, 13));
        Book book3 = new Book("A ja żem jej powiedziała", "Kasia Nosowska", LocalDate.of(2018, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        // When
        library.getBooks().remove(book1);

        int result = library.getBooks().size();
        int clonedResult = clonedLibrary.getBooks().size();
        int deepClonedResult = deepClonedLibrary.getBooks().size();

        // Then
        assertEquals(2, result);
        assertEquals(2, clonedResult);
        assertEquals(3, deepClonedResult);
    }
}
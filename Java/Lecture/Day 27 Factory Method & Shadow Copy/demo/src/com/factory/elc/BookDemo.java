package com.factory.elc;

import com.factory.blc.Book;

public class BookDemo {

    public static void main(String[] args) {
        Book b1 = Book.getBookObject();
        System.out.println(b1);
    }
}

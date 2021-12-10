package com.mfuster.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
        // *************** PART ONE ***************
        // We want a program where we can create a sorted list of books
        // A book has a title, author and publication date.
        // First, I want to be able to create a LIST of books, like if it is a bookstore.
        // I want to sort those books according to their title.
        // Assumption: two books can't have the same title.

        // *************** PART TWO ***************
        // What if I want three lists? One sorted by title first, other sorted by author first
        // and other sorted by year first.

        // *************** PART THREE ***************
    	// I want to create a SET of books, taken from the list.
    	

    	Book harryPotter = new Book("Harry Potter", "J.K.Rowling", 1997);
        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1818);
        Book hungerGames = new Book("Hunger Games", "Suzanne Collins", 2008);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book wizardOfOz = new Book("Wizard of Oz", "Frank Baum", 1900);
    	
        //interface list con ArrayList (clase)
        List <Book> listBook = new ArrayList <Book> ();
        
        listBook.add(harryPotter);
        listBook.add(frankenstein);
        listBook.add(hungerGames);
        listBook.add(prideAndPrejudice);
        listBook.add(wizardOfOz);
           
        //no se puede llamar a métodos que no esten en List:
        //listBook.sort(c);
        
        Collections.sort(listBook);
        printBookstore( listBook , "tite" );
       
        AuthorComparator authorComparator = new AuthorComparator();  
        listBook.sort(authorComparator);
        
        printBookstore( listBook , "author" );

    }
    
    public static void printBookstore(List<Book> bookstore, String sortingElement) {
        System.out.printf("Book sorted by %s%n", sortingElement);
        for(Book b : bookstore) {
            System.out.printf("%s (%s) - %d%n", b.getTitle(), b.getAuthor(), b.getYear());
        }
        System.out.println("\n");
    }
    

}

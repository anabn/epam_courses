package epam.taskForSithLecture;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String pathToFile = "fileToExecute";
    private static final int size = 6;

    public static void main(String[] args) {
        Books books = new Books(size);
        Books booksWithNewPercent = new Books(size);
        Books booksFilteredByAuthor = new Books(size);
        Books booksFilteredByAge = new Books(size);
        Books booksByAuthorName = new Books(size);
        Books booksByPublish = new Books(size);
        Books booksByPrice = new Books(size);
        books.setBookArray(new Book[]{
                new Book("1234", "first", "shevchenko", "AOON", 1790, "123", 123.6),
                new Book("1235", "second", "king", "NNJ", 2019, "333", 12.5),
                new Book("1236", "third", "freud", "TV", 1970, "345", 67.4),
                new Book("1237", "forth", "ostin", "MK", 1870, "445", 167.4),
                new Book("1238", "fifth", "polo", "TLM", 1930, "375", 97.0),
                new Book("1239", "sixth", "pushkin", "SX", 1890, "145", 117.4)
        });

        ReadAndWriteFromFile readAndWriteFromFile = new ReadAndWriteFromFile(pathToFile);
        readAndWriteFromFile.writeToLocalFile(books);
        Books booksFromFile = readAndWriteFromFile.readFromLocalFile();
        System.out.println("********  our information from file : ");
        booksFromFile.print();
        System.out.println("********  our information from file sorted by price order: ");
        booksFromFile.setBookArray(booksFromFile.sortedArrayByPriceReverce());
        booksFromFile.print();
        System.out.println("********  Sorted by author's name in alphabet order : ");
        booksByAuthorName.setBookArray(books.sortedArrayByOrder());
        booksByAuthorName.print();

        System.out.println("********  Sorted by published's name in alphabet order : ");
        booksByPublish.setBookArray(books.sortedArrayByPublished());
        booksByPublish.print();

        System.out.println("******** Sorted by descending price value : ");
        booksByPrice.setBookArray(books.sortedArrayByPriceReverce());
        booksByPrice.print();

        System.out.println("******** Enter percent : ");

        Scanner in = new Scanner(System.in);
        int percent = in.nextInt();
        booksWithNewPercent.setBookArray(books.changePriceBasedOnPercentage(percent));
        booksWithNewPercent.print();

        System.out.println("******** Enter age : ");
        int age = in.nextInt();
        booksFilteredByAge.setBookArray(books.findTheBookWithProperAge(age));
        booksFilteredByAge.print();

        System.out.println("******** Enter author : ");
        String author = in.next();
        booksFilteredByAuthor.setBookArray(books.findTheAuthorsBook(author));
        booksFilteredByAuthor.print();
//
        }
    }

package epam.taskForSithLecture;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/*
    опишите класс Books, который будет содержать массив объектов (поле)
    типа Book; конструктор, принимающий размер массива и выделяющий
    память под него; метод добавления одной книги; метод отображения всех
    книг в массиве; метод изменения стоимости книг на указанное количество
    процентов; метод поиска всех книг указанного автора; метод поиска всех
    книг, изданных после указанного года.
 */

public class Books extends Validator implements Serializable {
    private int arraySize;
    private Book[] bookArray = new Book[arraySize];

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public Books(int arraySize) {
        this.arraySize = arraySize;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public void print(){
        if (checkIfArrayIsEmpty(bookArray)){
            System.out.println("array is empty");
        } else {
            for (Book elem: bookArray) {
                System.out.println(elem.toString());
            }
        }

    }

    public Book[] changePriceBasedOnPercentage(double percent){
        if (validThePercent(percent)) {
            double ourPercent = 1 + percent / 100;
            for (Book a : bookArray) {
                a.setPrice(a.getPrice() * ourPercent);
            }
            return bookArray;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Book[] findTheAuthorsBook(String author){
        if(verifyTheAuthorName(author)) {
            Book[] reserveArray = new Book[arraySize];
            int count = 0;
            for (Book element : bookArray) {
                if (element.getAuthor().equals(author)) {
                    reserveArray[count++] = element;
                }
            }
            return Arrays.copyOf(reserveArray, count);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Book[] findTheBookWithProperAge(int booksAge){
        if(validAgeOfPublish(booksAge)) {
            Book[] reserveArray = new Book[arraySize];
            int count = 0;
            for (Book element : bookArray) {
                if (element.getYearPublished() > booksAge) {
                    reserveArray[count++] = element;
                }
            }
            return Arrays.copyOf(reserveArray, count);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Book[] sortedArrayByOrder(){
        Book[] reserveArray = Arrays.copyOf(bookArray, arraySize);
        Arrays.sort(reserveArray, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String author1 = ((Book)o1).getAuthor();
                String author2 = ((Book)o2).getAuthor();
                return author1.compareTo(author2);
            }
        });
        return reserveArray;
    }

    public Book[] sortedArrayByPublished(){
        Book[] reserveArray = Arrays.copyOf(bookArray, arraySize);
        Arrays.sort(reserveArray, new Comparator(){
                @Override
                public int compare(Object o1, Object o2) {
                String pub1 = ((Book)o1).getPublished();
                String pub2 = ((Book)o2).getPublished();
            return pub1.compareTo(pub2);
            }
        });
        return reserveArray;
    }

    public Book[] sortedArrayByPriceReverce(){
        Book[] reserveArray = Arrays.copyOf(bookArray, arraySize);
        Arrays.sort(reserveArray, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Double pub1 = ((Book)o1).getPrice();
                Double pub2 = ((Book)o2).getPrice();
                return pub2.compareTo(pub1);
            }
        });
        return reserveArray;
    }
}

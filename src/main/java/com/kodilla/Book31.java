import java.util.*;
import java.lang.*;



public class Book31 {



    private String title;
    private String author;
    private int year;

    public Book31 (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book31 book31 = (Book31) o;
        return year == book31.year && Objects.equals(title, book31.title) && Objects.equals(author, book31.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Book31{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
class Kodilla {

    public static void main(String[] args) {

        Book31 book1 = new Book31("Metro 2033", "Dmitri Głuchow", 2005);
        Book31 book2 = new Book31("Metro 2034", "Dmitri Głuchow", 2009);
        Book31 book3 = new Book31("Metro 2035", "Dmitri Głuchow", 2015);
        Book31 book4 = new Book31("Kościany Galeon", "Jacek Piekara", 2015);
        Book31 book5 = new Book31("Chrzest Ognia", "Andrzej Sapkowski", 1996);
        Book31 book6 = new Book31("The Skull Throne", "Peter V. Brett", 2015);
        Book31 book7 = new Book31 ("Ostatnich gryzą psy", "Naval", 2017);
        Book31 book8 = new Book31 ("Zatoka", "Naval", 2018);
        Book31 book9 = new Book31 ("Camp Pozzi", "Naval", 2019);

        Set<Book31>listOfBooks = new HashSet<>();

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        listOfBooks.add(book7);
        listOfBooks.add(book8);
        listOfBooks.add(book9);

    //    for (Book31 theList : listOfBooks) {          // pętla for each i wyświetlenie po dacie
    //        int yearOfWritten = theList.getYear();
    //        if (yearOfWritten > 2010) {
    //            System.out.println(theList);
    //        }
    //    }

    //    for (Book31 theList : listOfBooks) {        // pętla for each i wyswietlenie po dlugości tytułu
    //        int length = theList.getTitle().length();
    //        if (length > 14) {
    //            System.out.println(theList);
    //        }
    //    }


    }
}

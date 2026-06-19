import java.util.Arrays;


class Book {

    int bookId;
    String title;
    String author;


    Book(int id, String t, String a) {

        bookId = id;
        title = t;
        author = a;
    }


    void show() {

        System.out.println(bookId+" "+title+" "+author);
    }
}



public class LibraryManagement {



    // linear search

    static void linearSearch(Book books[], String title) {


        for(Book b : books) {


            if(b.title.equalsIgnoreCase(title)) {


                System.out.println("Book Found:");

                b.show();

                return;
            }
        }


        System.out.println("Book Not Found");
    }





    // binary search

    static void binarySearch(Book books[], String title) {


        int low = 0;

        int high = books.length - 1;



        while(low <= high) {


            int mid = (low + high) / 2;



            int value =
            books[mid].title.compareToIgnoreCase(title);



            if(value == 0) {


                System.out.println("Book Found:");

                books[mid].show();

                return;
            }


            else if(value < 0) {


                low = mid + 1;
            }


            else {


                high = mid - 1;
            }

        }


        System.out.println("Book Not Found");

    }







    public static void main(String args[]) {



        Book books[] = {


            new Book(1,"Java","James"),

            new Book(2,"Python","Guido"),

            new Book(3,"C Programming","Dennis"),

            new Book(4,"Database","Korth")

        };




        System.out.println("Linear Search:");

        linearSearch(books,"Python");





        Arrays.sort(books,(a,b)->
        a.title.compareToIgnoreCase(b.title));




        System.out.println("\nBinary Search:");

        binarySearch(books,"Java");


    }

}
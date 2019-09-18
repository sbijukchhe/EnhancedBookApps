import java.util.List;

public class BookApp {

    public static void main(String[] args){

        Book book = new Book();
        BookDatabase bd = new BookDatabase();
        List<Book> myBooks = bd.getBooks();

        for(Book x : myBooks ) {
            System.out.println(x.getDisplayText());
        }
    }
}


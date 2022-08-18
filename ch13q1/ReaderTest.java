package ch13q1;

public class ReaderTest {

	public static void main(String[] args) {
		Reader reader1 = new Reader();
        reader1.name = "Fatma";
        reader1.age = 27;
        reader1.sex = 'K';

        Author author = new Author("Stefan Zweig");

        Book book1 = new Book(author, "Chess", 80,BookType.CLASSICS, true,85);
        System.out.println("current page: "+book1.getCurrentPage());
		reader1.read(book1);

	}

}

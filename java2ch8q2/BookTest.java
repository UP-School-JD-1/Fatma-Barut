package java2ch8q2;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookTest {
	  public static void main(String[] args) {
		 
		  Book book1 = new Book(" Crime and Punishment ", 576);
		  Book book2 = new Book(" Chess ", 144);
		  
		  Comparator<Book> comparatorByPageNumber = (a1, a2) -> a1.getPages() - a2.getPages();

	      BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);
	      
	      System.out.println("Max page number -> " + maxPageNumberOperator.apply(book1, book2).getPages());
		  
	  }

}

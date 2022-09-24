package java2ch8q2;

public class Book implements Comparable<Object> {
	private String title;
	private int pages;
	
	public Book () {
		this.title = "No title specified!";
		this.pages = 0;
	}
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return title.compareTo(book.getTitle());
	}
	
	public void printInfo() {
		System.out.println(" *** Book Info *** ");
		System.out.println(this);
	}
	

}

package JAVA_04;

public class Book {
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title) {
		this(title,"μμ λ―Έμ");
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}


}

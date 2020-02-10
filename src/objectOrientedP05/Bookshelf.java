package objectOrientedP05;

public class Bookshelf {
	private int books;
	private int pages;

	public Bookshelf() {
		books = 10;
		pages = 123456;
	}

	public Bookshelf(int newbooks, int newpages) {
		books = newbooks;
		pages = newpages;
	}

	public void addBook() {
		books++;
	}

	public void removeBook() {
		books--;
	}

	public void clear() {
		books = books - books;
	}

	public double average() {
		return pages/books;
	}

}